/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.calendar.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.time.DateUtils;

import com.ourteam.calendar.dao.CalendarDate;
import com.ourteam.calendar.dao.CalendarDateDAOQueryBean;
import com.ourteam.calendar.dao.CalendarDefine;
import com.ourteam.calendar.dao.CalendarDefineDAOQueryBean;
import com.ourteam.calendar.dao.CalendarItem;
import com.ourteam.calendar.dao.CalendarItemDAOQueryBean;
import com.ourteam.calendar.dao.ICalendarDateDAO;
import com.ourteam.calendar.dao.ICalendarDefineDAO;
import com.ourteam.calendar.domain.CalendarDefineBean;
import com.ourteam.calendar.domain.CalendarItemBean;
import com.ourteam.calendar.domain.CalendarTypeEnum;

/**
 * ������� impl Generated Date 2011-06-03 09:30:04
 * 
 * @author $Auto Gen
 */
public class CalendarServiceImpl extends AbstractCalendarService {

	@Override
	protected CalendarItemBean[] doGetCalendarItems(long[] calendarIds,
			Date startDate, Date endDate) throws Exception {

		CalendarDateDAOQueryBean queryBean = new CalendarDateDAOQueryBean();

		queryBean.setDistinct(true);

		queryBean.createCriteria().andCalendarIdIn(calendarIds)
				.andItemDateGreaterThanOrEqualTo(startDate)
				.andItemDateLessThan(endDate);

		queryBean.setSortProperty(ICalendarDateDAO.ItemDate);

		return CalendarItemBean.toArray(this.calendarDateDao
				.queryCalendarItems(queryBean));
	}

	@Override
	protected void doAddCalendarItem(long calendarId,
			CalendarItemBean calendarItemBean) throws Exception {

		calendarItemBean.setCalendarId(calendarId);

		this.calendarItemDao.insertCalendarItem(calendarItemBean
				.convertToCalendarItem());

		addCalendarItemDates(calendarItemBean);

	}

	protected void addCalendarItemDates(CalendarItemBean calendarItemBean)
			throws Exception {
		Date satrtDate = calendarItemBean.getStartDateTime();

		Date endDate = calendarItemBean.getEndDateTime();

		List<CalendarDate> calendarDateList = new ArrayList<CalendarDate>();

		CalendarDate calendarDate = new CalendarDate();

		calendarDate.setCalendarId(calendarItemBean.getCalendarId());

		calendarDate.setCalendarItemId(calendarItemBean.getId());

		calendarDate.setItemDate(satrtDate);

		calendarDateList.add(calendarDate);

		if (DateUtils.isSameDay(satrtDate, endDate) == false) {

			CalendarDate endCalendarDate = new CalendarDate();

			endCalendarDate.setCalendarId(calendarItemBean.getCalendarId());

			endCalendarDate.setCalendarItemId(calendarItemBean.getId());

			endCalendarDate.setItemDate(endDate);

			calendarDateList.add(endCalendarDate);

			Date date = DateUtils.addDays(satrtDate, 1);

			while (date.before(endDate)) {

				CalendarDate tempCalendarDate = new CalendarDate();

				tempCalendarDate
						.setCalendarId(calendarItemBean.getCalendarId());

				tempCalendarDate.setCalendarItemId(calendarItemBean.getId());

				tempCalendarDate.setItemDate(date);

				calendarDateList.add(tempCalendarDate);

				date = DateUtils.addDays(date, 1);
			}
		}

		this.calendarDateDao.batchInsertCalendarDate(calendarDateList
				.toArray(new CalendarDate[calendarDateList.size()]));
	}

	@Override
	protected CalendarItemBean doGetCalendarItemById(long calendarItemId)
			throws Exception {
		CalendarItem calendarItem = this.calendarItemDao
				.findCalendarItemById(calendarItemId);
		return calendarItem != null ? new CalendarItemBean(calendarItem) : null;
	}

	@Override
	protected void doModifyCalendarItem(CalendarItemBean calendarItemBean)
			throws Exception {
		CalendarItem calendarItem = this.calendarItemDao
				.findCalendarItemById(calendarItemBean.getId());

		// calendarItemBean.setCalendarId(calendarItem.getCalendarId());

		if (calendarItem.getStartDateTime().equals(
				calendarItemBean.getStartDateTime()) == false
				|| calendarItem.getEndDateTime().equals(
						calendarItemBean.getEndDateTime()) == false) {
			CalendarDateDAOQueryBean queryBean = new CalendarDateDAOQueryBean();

			queryBean.createCriteria()
					.andCalendarIdEqualTo(calendarItem.getCalendarId())
					.andCalendarItemIdEqualTo(calendarItem.getId());

			this.calendarDateDao.deleteCalendarDate(queryBean);

			addCalendarItemDates(calendarItemBean);
		}

		this.calendarItemDao.updateCalendarItem(calendarItemBean
				.convertToCalendarItem());
	}

	@Override
	protected void doDeleteCalendarItems(long[] calendarItemIds)
			throws Exception {

		CalendarItemDAOQueryBean queryBean = new CalendarItemDAOQueryBean();

		queryBean.createCriteria().andIdIn(calendarItemIds);

		this.calendarItemDao.deleteCalendarDate(queryBean);

		this.calendarItemDao.deleteCalendarItem(queryBean);
	}

	@Override
	protected CalendarDefineBean doGetCalendarDefineById(long calendarDefineId)
			throws Exception {

		CalendarDefine calendarDefine = this.calendarDefineDao
				.findCalendarDefineById(calendarDefineId);

		return calendarDefine != null ? new CalendarDefineBean(calendarDefine)
				: null;
	}

	@Override
	protected CalendarDefineBean doGetSystemCalendarDefine() throws Exception {
		CalendarDefineDAOQueryBean queryBean = new CalendarDefineDAOQueryBean();

		queryBean.createCriteria().andOwnerIdEqualTo(0)
				.andCalendarTypeEqualTo("SYSTEM");

		CalendarDefine[] calendarDefines = this.calendarDefineDao
				.queryCalendarDefine(queryBean);

		if (ArrayUtils.isEmpty(calendarDefines)) {

			CalendarDefine calendarDefine = new CalendarDefine();

			calendarDefine.setOwnerId(0);

			calendarDefine.setCalendarType("SYSTEM");

			calendarDefine.setCalendarName("System's Calendar");

			this.calendarDefineDao.insertCalendarDefine(calendarDefine);

			return new CalendarDefineBean(calendarDefine);

		} else {
			return new CalendarDefineBean(calendarDefines[0]);
		}

	}

	@Override
	protected CalendarDefineBean[] doGetCalendarDefines(long[] calendarIds)
			throws Exception {
		CalendarDefineDAOQueryBean queryBean = new CalendarDefineDAOQueryBean();

		queryBean.createCriteria().andIdIn(calendarIds);

		CalendarDefine[] calendarDefines = this.calendarDefineDao
				.queryCalendarDefine(queryBean);

		return CalendarDefineBean.toArray(calendarDefines);
	}

	@Override
	protected void doModifyCalendarDefine(CalendarDefineBean calendarDefineBean)
			throws Exception {

		this.calendarDefineDao.updateCalendarDefine(calendarDefineBean
				.convertToCalendarDefine());

	}

	@Override
	protected CalendarDefineBean[] doGetCalendarDefinesByOwnerId(
			long[] ownerIds, CalendarTypeEnum calendarTypeEnum)
			throws Exception {

		CalendarDefineDAOQueryBean queryBean = new CalendarDefineDAOQueryBean();

		queryBean.createCriteria().andOwnerIdIn(ownerIds)
				.andCalendarTypeEqualTo(calendarTypeEnum.getName());

		queryBean.setSortProperty(ICalendarDefineDAO.CalendarType);

		queryBean.setSortProperty(ICalendarDefineDAO.OwnerId);

		return CalendarDefineBean.toArray(this.calendarDefineDao
				.queryCalendarDefine(queryBean));
	}

	@Override
	protected void doAddCalendarDefine(long ownerId,
			CalendarTypeEnum calendarTypeEnum,
			CalendarDefineBean calendarDefineBean) throws Exception {

		calendarDefineBean.setOwnerId(ownerId);

		calendarDefineBean.setCalendarType(calendarTypeEnum.getName());

		this.calendarDefineDao.insertCalendarDefine(calendarDefineBean
				.convertToCalendarDefine());
	}

	@Override
	protected void doDeleteCalendarDefines(long[] calendarIds) throws Exception {

		if (ArrayUtils.isEmpty(calendarIds)) {
			return;
		}

		CalendarItemDAOQueryBean queryBean = new CalendarItemDAOQueryBean();

		queryBean.createCriteria().andCalendarIdIn(calendarIds);

		queryBean.addIdSelectProperty();

		Map[] maps = this.calendarItemDao
				.queryCalendarDatesSelective(queryBean);

		long[] calendarItemIds = new long[maps.length];

		for (int i = 0; i < calendarItemIds.length; i++) {
			calendarItemIds[i] = MapUtils.getLongValue(maps[i], "id");
		}

		if (ArrayUtils.isNotEmpty(calendarItemIds)) {

			deleteCalendarItems(calendarItemIds);
		}

		CalendarDefineDAOQueryBean defineDAOQueryBean = new CalendarDefineDAOQueryBean();

		defineDAOQueryBean.createCriteria().andIdIn(calendarIds);

		this.calendarDefineDao.deleteCalendarDefine(defineDAOQueryBean);

	}

} // end CalendarServiceImpl
