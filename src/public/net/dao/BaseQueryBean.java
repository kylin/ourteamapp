package net.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseQueryBean implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(BaseQueryBean.class);

	private int start = 0;

	private int maxResults = -1;

	private int totalResult;

	private boolean distinct = false;

	private List sortProperties = new ArrayList();

	private List selectProperties = new ArrayList();

	private List groupProperties = new ArrayList();

	private List joinList = new ArrayList();

	protected List oredCriteria;

	private Map tableReplaceMap = new HashMap();

	public static final String LEFT_JOIN = "LEFT";

	public static final String INNER_JOIN = "INNER";

	public BaseQueryBean() {
		super();
		oredCriteria = new ArrayList();

	}

	protected void setTableReplaceMap(Map tableReplaceMap) {
		this.tableReplaceMap = tableReplaceMap;
	}

	public BaseQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
		if (aQueryBean != null) {
			aQueryBean.tableReplaceMap = tableReplaceMap;
			this.oredCriteria = aQueryBean.copyOredCriteria();

			List sortProperties = aQueryBean.getSortProperties();

			for (Iterator iterator = sortProperties.iterator(); iterator
					.hasNext();) {
				SortProperty sortProperty = (SortProperty) iterator.next();
				this.setSortProperty(sortProperty.getProperty(),
						"ASC".equalsIgnoreCase(sortProperty.getAscending()));
			}

			List groupList = aQueryBean.getGroupProperties();

			for (Iterator iterator = groupList.iterator(); iterator.hasNext();) {
				String groupProperty = (String) iterator.next();
				this.setGroupProperty(groupProperty);
			}

			List joinList = aQueryBean.getJoinList();

			for (Iterator iterator = joinList.iterator(); iterator.hasNext();) {
				Join join = (Join) iterator.next();
				this.addJoin(join.getTableName(), join.getTableAlias(),
						join.getJoinCriterion(), join.getJoinType());
			}

			List selectProperties = aQueryBean.getSelectProperties();

			for (Iterator iterator = selectProperties.iterator(); iterator
					.hasNext();) {
				SelectProperty selectProperty = (SelectProperty) iterator
						.next();
				this.addSelectProperty(selectProperty.getProperty(),
						selectProperty.getAlias());
			}

		}
	}

	public BaseQueryBean(BaseQueryBean aQueryBean) {
		super();

		if (aQueryBean != null) {

			this.oredCriteria = aQueryBean.copyOredCriteria();

			List sortProperties = aQueryBean.getSortProperties();

			for (Iterator iterator = sortProperties.iterator(); iterator
					.hasNext();) {
				SortProperty sortProperty = (SortProperty) iterator.next();
				this.setSortProperty(sortProperty.getProperty(), sortProperty
						.getAscending().equalsIgnoreCase("ASC"));
			}

			List groupList = aQueryBean.getGroupProperties();

			for (Iterator iterator = groupList.iterator(); iterator.hasNext();) {
				String groupProperty = (String) iterator.next();
				this.setGroupProperty(groupProperty);
			}

			List joinList = aQueryBean.getJoinList();

			for (Iterator iterator = joinList.iterator(); iterator.hasNext();) {
				Join join = (Join) iterator.next();
				this.addJoin(join.getTableName(), join.getTableAlias(),
						join.getJoinCriterion(), join.getJoinType());
			}

			List selectProperties = aQueryBean.getSelectProperties();

			for (Iterator iterator = selectProperties.iterator(); iterator
					.hasNext();) {
				SelectProperty selectProperty = (SelectProperty) iterator
						.next();
				this.addSelectProperty(selectProperty.getProperty(),
						selectProperty.getAlias());
			}

			this.maxResults = aQueryBean.getMaxResults();
			this.sortProperties.addAll(aQueryBean.getSortProperties());
			this.start = aQueryBean.getStart();
			this.distinct = aQueryBean.isDistinct();
		}

	}

	protected void reProcessOredCriteris() {
		for (Iterator iterator = this.oredCriteria.iterator(); iterator
				.hasNext();) {
			BaseWhereCriterion criterion = (BaseWhereCriterion) iterator.next();

			List criteriaWithBetweenValue = new ArrayList();

			for (Iterator betweenIterator = criterion.criteriaWithBetweenValue
					.iterator(); betweenIterator.hasNext();) {
				Map map = (Map) betweenIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithBetweenValue.add(newMap);

			}

			criterion.criteriaWithBetweenValue.clear();

			criterion.criteriaWithBetweenValue.addAll(criteriaWithBetweenValue);

			List criteriaWithForeignKey = new ArrayList();

			for (Iterator foreignKeyIterator = criterion.criteriaWithForeignKey
					.iterator(); foreignKeyIterator.hasNext();) {
				String condition = (String) foreignKeyIterator.next();
				String processedCondition = processCondiction(condition);

				criteriaWithForeignKey.add(processedCondition);
			}

			criterion.criteriaWithForeignKey.clear();

			criterion.criteriaWithForeignKey.addAll(criteriaWithForeignKey);

			List criteriaWithListValue = new ArrayList();

			for (Iterator listIterator = criterion.criteriaWithListValue
					.iterator(); listIterator.hasNext();) {
				Map map = (Map) listIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithListValue.add(newMap);

			}

			criterion.criteriaWithListValue.clear();

			criterion.criteriaWithListValue.addAll(criteriaWithListValue);

			List criteriaWithoutValue = new ArrayList();

			for (Iterator withoutValueIterator = criterion.criteriaWithoutValue
					.iterator(); withoutValueIterator.hasNext();) {
				String condition = (String) withoutValueIterator.next();
				String processedCondition = processCondiction(condition);

				criteriaWithoutValue.add(processedCondition);
			}

			criterion.criteriaWithoutValue.clear();

			criterion.criteriaWithoutValue.addAll(criteriaWithoutValue);

			List criteriaWithSingleValue = new ArrayList();

			for (Iterator withSingleIterator = criterion.criteriaWithSingleValue
					.iterator(); withSingleIterator.hasNext();) {
				Map map = (Map) withSingleIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithSingleValue.add(newMap);

			}

			criterion.criteriaWithSingleValue.clear();
			criterion.criteriaWithSingleValue.addAll(criteriaWithSingleValue);

		}
	}

	protected static String getEnumTypeErrorMessage(String aPropertyName,
			String value, Collection enumList) {
		StringBuffer errorMessage = new StringBuffer();

		errorMessage.append("The ").append(aPropertyName).append("value [");

		errorMessage.append(value);

		errorMessage.append("] is not allow,The allowed values is ");

		errorMessage.append(enumList);

		return errorMessage.toString();
	}

	public boolean isDistinct() {
		return distinct;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public class Join implements Serializable {

		private String tableName;

		private String joinType;

		private String tableAlias;

		private BaseQueryBean joinCriterion;

		public String getTableName() {
			return tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableAlias() {
			return tableAlias;
		}

		public void setTableAlias(String tableAlias) {
			this.tableAlias = tableAlias;
		}

		public BaseQueryBean getJoinCriterion() {
			return joinCriterion;
		}

		public void setJoinCriterion(BaseQueryBean joinCriterion) {
			this.joinCriterion = joinCriterion;
		}

		public String getJoinType() {
			return joinType;
		}

		public void setJoinType(String joinType) {
			this.joinType = joinType;
		}

	}

	public class SelectProperty implements Serializable {

		private String property;

		private String alias;

		public String getProperty() {
			return property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getAlias() {
			return alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}
	}

	public class SortProperty implements Serializable {

		protected String property;
		protected String ascending;

		public String getProperty() {
			return property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getAscending() {
			return ascending;
		}

		public void setAscending(String ascending) {
			this.ascending = ascending;
		}

		public String toString() {
			StringBuffer str = new StringBuffer(this.property);
			str.append(" ").append(this.ascending);
			return str.toString();
		}

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result
					+ ((property == null) ? 0 : property.hashCode());
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			SortProperty other = (SortProperty) obj;
			if (!getOuterType().equals(other.getOuterType())) {
				return false;
			}
			if (property == null) {
				if (other.property != null) {
					return false;
				}
			} else if (!property.equals(other.property)) {
				return false;
			}
			return true;
		}

		private BaseQueryBean getOuterType() {
			return BaseQueryBean.this;
		}

	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public List getSortProperties() {
		return sortProperties;
	}

	public List getSelectProperties() {
		return selectProperties;
	}

	public List getGroupProperties() {
		return groupProperties;
	}

	private void processTableAlias(List cond, String aTableName, String aAlias) {
		
		int index = 0;
		
		for (Iterator iterator = cond.iterator(); iterator.hasNext();) {

			Object condObj = iterator.next();
			if (condObj instanceof Map) {
				Map condMap = (Map) condObj;
				if (condMap.containsKey("condition")) {
					String condValue = (String) condMap.get("condition");

					condValue = StringUtils.replace(condValue,
							aTableName + ".", aAlias + ".");

					condMap.put("condition", condValue);
				}
			} else if (condObj instanceof String) {
				String condValue = (String) condObj;

				condValue = StringUtils.replace(condValue, aTableName + ".",
						aAlias + ".");
				
				cond.set(index, condValue);


			}
			
			index++;
		}
	}

	public void addJoin(String aTableName, String aAlias,
			BaseQueryBean aJionCriterion, String aJoinType) {

		Join jion = new Join();

		jion.setTableName(processCondiction(aTableName));

		if (StringUtils.isNotBlank(aAlias)) {
			jion.setTableAlias(aAlias);

			List criterialist = aJionCriterion.oredCriteria;

			for (Iterator iterator = criterialist.iterator(); iterator
					.hasNext();) {
				BaseWhereCriterion criteria = (BaseWhereCriterion) iterator
						.next();

				processTableAlias(criteria.criteriaWithSingleValue, aTableName,
						aAlias);
				processTableAlias(criteria.criteriaWithoutValue, aTableName,
						aAlias);
				processTableAlias(criteria.criteriaWithListValue, aTableName,
						aAlias);
				processTableAlias(criteria.criteriaWithBetweenValue,
						aTableName, aAlias);
				processTableAlias(criteria.criteriaWithForeignKey, aTableName,
						aAlias);

			}

		}
		jion.setJoinCriterion(aJionCriterion);

		if (StringUtils.isNotBlank(aJoinType)) {
			jion.setJoinType(aJoinType);
		} else {
			jion.setJoinType("LEFT");
		}

		this.joinList.add(jion);

	}

	public void addJoin(String aTableName, BaseQueryBean aJionCriterion,
			String aJoinType) {

		addJoin(aTableName, null, aJionCriterion, aJoinType);
	}

	public void addJoin(String aTableName, String aAlias,
			BaseQueryBean aJionCriterion) {
		addJoin(aTableName, aAlias, aJionCriterion, null);
	}

	public void addJoin(String aTableName, BaseQueryBean aJionCriterion) {
		addJoin(aTableName, aJionCriterion, null);
	}

	public void addInnerJoin(String aTableName, String aAlias,
			BaseQueryBean aJionCriterion) {
		addJoin(aTableName, aAlias, aJionCriterion, INNER_JOIN);
	}

	public void addInnerJoin(String aTableName, BaseQueryBean aJionCriterion) {
		addJoin(aTableName, aJionCriterion, INNER_JOIN);
	}

	public void addSelectProperty(String aProperty, String aAlias) {
		SelectProperty funProperty = new SelectProperty();
		funProperty.setProperty(processCondiction(aProperty));
		funProperty.setAlias(aAlias);
		this.selectProperties.add(funProperty);
	}

	public void addSelectProperty(String aProperty) {
		SelectProperty funProperty = new SelectProperty();
		funProperty.setProperty(processCondiction(aProperty));
		funProperty.setAlias(aProperty);
		this.selectProperties.add(funProperty);
	}

	public void clearSelectPropertie() {
		this.selectProperties.clear();
	}

	public void addSumFunctionPropertie(String aProperty, String aAlias) {
		StringBuffer function = new StringBuffer("sum(");
		function.append(aProperty);
		function.append(")");
		addSelectProperty(function.toString(), aAlias);
	}

	public void addCountFunctionProperty(String aProperty, String aAlias) {
		StringBuffer function = new StringBuffer("count(");
		function.append(aProperty);
		function.append(")");
		addSelectProperty(function.toString(), aAlias);
	}

	public void addMaxFunctionProperty(String aProperty, String aAlias) {
		StringBuffer function = new StringBuffer("max(");
		function.append(aProperty);
		function.append(")");
		addSelectProperty(function.toString(), aAlias);
	}

	public void addMinFunctionProperty(String aProperty, String aAlias) {
		StringBuffer function = new StringBuffer("min(");
		function.append(aProperty);
		function.append(")");
		addSelectProperty(function.toString(), aAlias);
	}

	public void addAvgFunctionProperty(String aProperty, String aAlias) {
		StringBuffer function = new StringBuffer("avg(");
		function.append(aProperty);
		function.append(")");
		addSelectProperty(function.toString(), aAlias);
	}

	public void setSortProperty(String aPropertyName, boolean aIsAsc) {
		SortProperty sortProperty = new SortProperty();
		sortProperty.property = processCondiction(aPropertyName);
		if (aIsAsc == false) {
			sortProperty.ascending = "DESC";
		} else {
			sortProperty.ascending = "ASC";
		}
		int index = this.sortProperties.indexOf(sortProperty);

		if (index == -1) {
			this.sortProperties.add(sortProperty);
		} else {
			SortProperty property = (SortProperty) this.sortProperties
					.get(index);
			if (property.ascending.equals(sortProperty.ascending) == false) {
				this.sortProperties.remove(index);
				this.sortProperties.add(sortProperty);
			}
		}
	}

	public void setSortProperty(String aPropertyName) {
		setSortProperty(aPropertyName, true);
	}

	public void setGroupProperty(String aPropertyName) {

		String propertyName = processCondiction(aPropertyName);

		int index = this.groupProperties.indexOf(propertyName);

		if (index == -1) {
			this.groupProperties.add(propertyName);
		}
	}

	public int getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	public void or(BaseWhereCriterion criteria) {
		if (criteria == null) {
			return;
		}
		if(oredCriteria.contains(criteria) == false){
			oredCriteria.add(criteria);
		}
		
	}

	public void and(BaseWhereCriterion criteria) {
		if (criteria == null) {
			return;
		}
		if (this.oredCriteria.isEmpty() == false) {
			for (Iterator iterator = this.oredCriteria.iterator(); iterator
					.hasNext();) {
				BaseWhereCriterion criterion = (BaseWhereCriterion) iterator
						.next();
				
				if(criterion == criteria){
					continue;
				}
				
				criterion.criteriaWithBetweenValue
						.addAll(criteria.criteriaWithBetweenValue);
				criterion.criteriaWithForeignKey
						.addAll(criteria.criteriaWithForeignKey);
				criterion.criteriaWithListValue
						.addAll(criteria.criteriaWithListValue);
				criterion.criteriaWithoutValue
						.addAll(criteria.criteriaWithoutValue);
				criterion.criteriaWithSingleValue
						.addAll(criteria.criteriaWithSingleValue);
			}
		} else {
			this.oredCriteria.add(criteria);
		}
	}

	public List getOredCriteria() {
		return oredCriteria;
	}

	public List copyOredCriteria() {
		List newOredCriteria = new ArrayList();
		for (Iterator iterator = this.oredCriteria.iterator(); iterator
				.hasNext();) {
			BaseWhereCriterion criterion = (BaseWhereCriterion) iterator.next();

			BaseWhereCriterion newCriterion = new BaseWhereCriterion(this);

			List criteriaWithBetweenValue = new ArrayList();

			for (Iterator betweenIterator = criterion.criteriaWithBetweenValue
					.iterator(); betweenIterator.hasNext();) {
				Map map = (Map) betweenIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithBetweenValue.add(newMap);

			}

			newCriterion.criteriaWithBetweenValue.clear();

			newCriterion.criteriaWithBetweenValue
					.addAll(criteriaWithBetweenValue);

			List criteriaWithForeignKey = new ArrayList();

			for (Iterator foreignKeyIterator = criterion.criteriaWithForeignKey
					.iterator(); foreignKeyIterator.hasNext();) {
				String condition = (String) foreignKeyIterator.next();
				String processedCondition = processCondiction(condition);

				criteriaWithForeignKey.add(processedCondition);
			}

			newCriterion.criteriaWithForeignKey.clear();

			newCriterion.criteriaWithForeignKey.addAll(criteriaWithForeignKey);

			List criteriaWithListValue = new ArrayList();

			for (Iterator listIterator = criterion.criteriaWithListValue
					.iterator(); listIterator.hasNext();) {
				Map map = (Map) listIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithListValue.add(newMap);

			}

			newCriterion.criteriaWithListValue.clear();

			newCriterion.criteriaWithListValue.addAll(criteriaWithListValue);

			List criteriaWithoutValue = new ArrayList();

			for (Iterator withoutValueIterator = criterion.criteriaWithoutValue
					.iterator(); withoutValueIterator.hasNext();) {
				String condition = (String) withoutValueIterator.next();
				String processedCondition = processCondiction(condition);

				criteriaWithoutValue.add(processedCondition);
			}

			newCriterion.criteriaWithoutValue.clear();

			newCriterion.criteriaWithoutValue.addAll(criteriaWithoutValue);

			List criteriaWithSingleValue = new ArrayList();

			for (Iterator withSingleIterator = criterion.criteriaWithSingleValue
					.iterator(); withSingleIterator.hasNext();) {
				Map map = (Map) withSingleIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithSingleValue.add(newMap);

			}

			newCriterion.criteriaWithSingleValue.clear();
			newCriterion.criteriaWithSingleValue
					.addAll(criteriaWithSingleValue);
			
			List criteriaWithSubQuery = new ArrayList();
			
			for (Iterator withSubQueryIterator = criterion.criteriaWithSubQuery
					.iterator(); withSubQueryIterator.hasNext();) {
				Map map = (Map) withSubQueryIterator.next();

				Map newMap = new HashMap();

				newMap.putAll(map);

				String condition = (String) newMap.get("condition");

				String processedCondition = processCondiction(condition);

				newMap.put("condition", processedCondition);

				criteriaWithSubQuery.add(newMap);

			}

			newCriterion.criteriaWithSubQuery.clear();
			newCriterion.criteriaWithSubQuery
					.addAll(criteriaWithSubQuery);

			newOredCriteria.add(newCriterion);

		}

		return newOredCriteria;
	}

	public void setOredCriteria(List oredCriteria) {
		this.oredCriteria = oredCriteria;

	}

	public void clear() {
		oredCriteria.clear();
		clearSelectPropertie();
		sortProperties.clear();
		this.groupProperties.clear();
		this.joinList.clear();
		this.start = 0;
		this.maxResults = -1;
		this.distinct = false;
	}

	public List getJoinList() {
		return joinList;
	}

	protected String processCondiction(String aCod) {

		if (this.tableReplaceMap != null
				&& this.tableReplaceMap.isEmpty() == false) {

			for (Iterator iterator = this.tableReplaceMap.keySet().iterator(); iterator
					.hasNext();) {
				String key = (String) iterator.next();
				if (StringUtils.contains(aCod, key + ".")) {
					aCod = StringUtils.replace(aCod, key + ".",
							(String) this.tableReplaceMap.get(key) + ".");
				}
			}

		}

		if (StringUtils.contains(aCod, "#") == false) {
			return aCod;
		}

		String property = StringUtils.substringBetween(aCod, "#");

		if (StringUtils.isNotBlank(property)) {
			try {
				String value = BeanUtils.getProperty(this, property);
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
}
