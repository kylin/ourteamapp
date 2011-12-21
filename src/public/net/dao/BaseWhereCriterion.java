package net.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseWhereCriterion implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(BaseWhereCriterion.class);

	protected List criteriaWithoutValue;

	protected List criteriaWithSingleValue;

	protected List criteriaWithListValue;

	protected List criteriaWithBetweenValue;

	protected List criteriaWithForeignKey;

	protected List criteriaWithSubQuery;

	private Object parentObject;

	public BaseWhereCriterion(Object aParentObject) {
		super();
		this.parentObject = aParentObject;
		criteriaWithoutValue = new ArrayList();
		criteriaWithSingleValue = new ArrayList();
		criteriaWithListValue = new ArrayList();
		criteriaWithBetweenValue = new ArrayList();
		criteriaWithForeignKey = new ArrayList();
		criteriaWithSubQuery = new ArrayList();
	}

	public boolean getValid() {
		return isValid();
	}

	public boolean isValid() {
		return criteriaWithoutValue.size() > 0
				|| criteriaWithSingleValue.size() > 0
				|| criteriaWithListValue.size() > 0
				|| criteriaWithBetweenValue.size() > 0
				|| criteriaWithForeignKey.size() > 0
				|| criteriaWithSubQuery.size() > 0;
	}

	public List getCriteriaWithoutValue() {
		return criteriaWithoutValue;
	}

	public List getCriteriaWithSingleValue() {
		return criteriaWithSingleValue;
	}

	public List getCriteriaWithListValue() {
		return criteriaWithListValue;
	}

	public List getCriteriaWithBetweenValue() {
		return criteriaWithBetweenValue;
	}

	public List getCriteriaWithForeignKey() {
		return criteriaWithForeignKey;
	}

	public List getCriteriaWithSubQuery() {
		return criteriaWithSubQuery;
	}

	protected void addForeignKeyCriterion(String condition) {
		if (condition == null) {
			throw new IllegalArgumentException(
					"Value for condition cannot be null");
		}
		String processedCondition = processCondiction(condition);
		criteriaWithForeignKey.add(processedCondition);
	}

	public void andCriterion(String aField, String condition) {
		if (condition == null) {
			throw new IllegalArgumentException(
					"Value for condition cannot be null");
		}
		StringBuffer cond = new StringBuffer();
		cond.append(processCondiction(aField));
		cond.append(processCondiction(condition));

		criteriaWithoutValue.add(cond.toString());
	}

	public void addCriterion(String condition) {
		if (condition == null) {
			throw new IllegalArgumentException(
					"Value for condition cannot be null");
		}
		String processedCondition = processCondiction(condition);
		criteriaWithoutValue.add(processedCondition);
	}

	public void addCriterion(String condition, Object value, String property) {
		if (value == null) {
			throw new IllegalArgumentException("Value for " + property
					+ " cannot be null");
		}
		String processedCondition = processCondiction(condition);
		Map map = new HashMap();
		map.put("condition", processedCondition);
		map.put("value", value);
		criteriaWithSingleValue.add(map);
	}

	protected void addCriterion(String condition, int[] values, String property) {
		addCriterion(condition, Arrays.asList(ArrayUtils.toObject(values)),
				property);
	}

	protected void addCriterion(String condition, long[] values, String property) {
		addCriterion(condition, Arrays.asList(ArrayUtils.toObject(values)),
				property);
	}

	protected void addCriterion(String condition, float[] values,
			String property) {
		addCriterion(condition, Arrays.asList(ArrayUtils.toObject(values)),
				property);
	}

	protected void addCriterion(String condition, double[] values,
			String property) {
		addCriterion(condition, Arrays.asList(ArrayUtils.toObject(values)),
				property);
	}

	protected void addCriterion(String condition, List values, String property) {
		if (values == null || values.size() == 0) {
			throw new IllegalArgumentException("Value list for " + property
					+ " cannot be null or empty");
		}
		String processedCondition = processCondiction(condition);
		Map map = new HashMap();
		map.put("condition", processedCondition);
		map.put("values", values);
		criteriaWithListValue.add(map);
	}

	protected void addCriterion(String condition, int value1, int value2,
			String property) {
		addCriterion(condition, Integer.valueOf(value1),
				Integer.valueOf(value2), property);
	}

	protected void addCriterion(String condition, long value1, long value2,
			String property) {
		addCriterion(condition, Long.valueOf(value1), Long.valueOf(value2),
				property);
	}

	protected void addCriterion(String condition, float value1, float value2,
			String property) {
		addCriterion(condition, Float.valueOf(value1), Float.valueOf(value2),
				property);
	}

	protected void addCriterion(String condition, double value1, double value2,
			String property) {
		addCriterion(condition, Double.valueOf(value1), Double.valueOf(value2),
				property);
	}

	protected void addCriterion(String condition, Object value1, Object value2,
			String property) {
		if (value1 == null || value2 == null) {
			throw new IllegalArgumentException("Between values for " + property
					+ " cannot be null");
		}
		List list = new ArrayList();
		list.add(value1);
		list.add(value2);
		String processedCondition = processCondiction(condition);
		Map map = new HashMap();
		map.put("condition", processedCondition);
		map.put("values", list);
		criteriaWithBetweenValue.add(map);
	}

	protected void addCriterionForJDBCDate(String condition, Date value,
			String property) {
		addCriterion(condition, new java.sql.Timestamp(value.getTime()),
				property);
	}

	protected void addCriterionForJDBCDate(String condition, List values,
			String property) {
		if (values == null || values.size() == 0) {
			throw new IllegalArgumentException("Value list for " + property
					+ " cannot be null or empty");
		}
		List dateList = new ArrayList();
		Iterator iter = values.iterator();
		while (iter.hasNext()) {
			dateList.add(new java.sql.Timestamp(((Date) iter.next()).getTime()));
		}
		addCriterion(condition, dateList, property);
	}

	protected void addCriterionForJDBCDate(String condition, Date value1,
			Date value2, String property) {
		if (value1 == null || value2 == null) {
			throw new IllegalArgumentException("Between values for " + property
					+ " cannot be null");
		}
		addCriterion(condition, new java.sql.Timestamp(value1.getTime()),
				new java.sql.Timestamp(value2.getTime()), property);
	}

	protected void addCriterion(String condition, SQLBean sqlBean,
			String property) {
		if (sqlBean == null || StringUtils.isBlank(sqlBean.getSql())) {
			throw new IllegalArgumentException("Sub Query SQL for " + property
					+ " cannot be null or empty");
		}
		String processedCondition = processCondiction(condition);
		Map map = new HashMap();
		map.put("condition", processedCondition);
		map.put("values", sqlBean);
		criteriaWithSubQuery.add(map);
	}

	protected String processCondiction(String aCod) {

		if (StringUtils.contains(aCod, "#") == false) {
			return aCod;
		}

		String property = StringUtils.substringBetween(aCod, "#");

		if (StringUtils.isNotBlank(property)) {
			try {
				String value = BeanUtils.getProperty(getParentObject(),
						property);
				if (value != null) {
					String str = new String(aCod);
					return StringUtils
							.replace(str, "#" + property + "#", value);
				} else {
					return aCod;
				}
			} catch (Exception e) {
				logger.error("Process Condiction Error", e);
				return aCod;
			}
		} else {
			return property;
		}

	}

	public Object getParentObject() {
		return parentObject;
	}


}
