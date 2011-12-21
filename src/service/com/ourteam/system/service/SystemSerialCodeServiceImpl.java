/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
 */
package com.ourteam.system.service;

import java.text.DecimalFormat;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ourteam.system.dao.SysSerialCode;
import com.ourteam.system.dao.SysSerialCodeDAOQueryBean;

/**
 * ϵͳ���кŷ��� impl Generated Date 2011-10-28 09:57:56
 * 
 * @author $Auto Gen
 */
public class SystemSerialCodeServiceImpl extends
		AbstractSystemSerialCodeService {
	/**
	 * ȡ�����к� impl
	 * 
	 * @param codeType
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws Exception
	 */
	protected String doGetSerialCode(final String codeType) throws Exception {

		SysSerialCodeDAOQueryBean queryBean = new SysSerialCodeDAOQueryBean();

		queryBean.setDistinct(true);

		queryBean.createCriteria().andCodeTypeEqualTo(codeType);

		SysSerialCode[] serialCodes = this.sysSerialCodeDao
				.querySysSerialCode(queryBean);

		if (ArrayUtils.isEmpty(serialCodes)) {
			throw new Exception("Not Found Code Type '" + codeType + "'");
		}

		long currentNumber = serialCodes[0].getSerialNumber();

		int inc = serialCodes[0].getSerialNumberIncrement();

		currentNumber = currentNumber + inc;

		String codetemplate = serialCodes[0].getCodeTemplate();

		String serialNumber = String.valueOf(currentNumber);

		if (StringUtils.isNotBlank(serialCodes[0].getSerialNumberFormat())) {
			DecimalFormat decimalFormat = new DecimalFormat(
					serialCodes[0].getSerialNumberFormat());

			serialNumber = decimalFormat.format(currentNumber);
		}
		
		serialCodes[0].setSerialNumber(currentNumber);
		
		this.sysSerialCodeDao.updateSysSerialCode(serialCodes[0]);
		
		return StringUtils.replace(codetemplate, "${serialNumber}",
				serialNumber);

	} // end doGetSerialCode()
} // end SystemSerialCodeServiceImpl
