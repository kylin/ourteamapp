package net.dao;

import java.util.Map;

public interface IDataAccessInterface<DataObject, DataQueryBean extends BaseQueryBean> {

	interface ISynchronizeCallback<DataObject> {
		/**
		 * 
		 * @param willAddDataArray
		 * @param willUpdateDataArray
		 * @param willDeleteDataArray
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void checkSynchronizeObjects(DataObject[] willAddDataArray,
				DataObject[] willUpdateDataArray,
				DataObject[] willDeleteDataArray) throws Exception;

		/**
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void beforeDelete(DataObject[] datas) throws Exception;

		/**
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void afterDelete(DataObject[] datas) throws Exception;

		/**
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void beforeInsert(DataObject[] datas) throws Exception;

		/**
		 * DOCUMENT ME!
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void afterInsert(DataObject[] datas) throws Exception;

		/**
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void beforeUpdate(DataObject[] datas) throws Exception;

		/**
		 * 
		 * @param datas
		 * 
		 * @throws Exception
		 *             DOCUMENT ME!
		 */
		void afterUpdate(DataObject[] datas) throws Exception;
	}

	/**
	 * Check Data Unique
	 * 
	 * @param data
	 * 
	 * @return true: data is unique,false : data is not unique
	 * 
	 * @throws Exception
	 */
	boolean checkIsUnique(final DataObject data) throws Exception;

	/**
	 * insert Data
	 * 
	 * @param data
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void insert(final DataObject data) throws Exception;

	/**
	 * Batch Insert Data
	 * 
	 * @param datas
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void batchInsert(final DataObject[] datas) throws Exception;

	/**
	 * Delete By Query Conditions
	 * 
	 * @param queryBean
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void delete(DataQueryBean queryBean) throws Exception;
	
	/**
	 * Delete Data
	 * 
	 * @param queryBean
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void delete(DataObject data) throws Exception;

	/**
	 * Modify Data
	 * 
	 * @param data
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void update(DataObject data) throws Exception;

	/**
	 * Batch Modify Data
	 * 
	 * @param datas
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void batchUpdate(DataObject[] datas) throws Exception;

	/**
	 * Modify Data By Query Conditions
	 * 
	 * @param data
	 * @param queryBean
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void update(DataObject data, DataQueryBean queryBean) throws Exception;

	/**
	 * Get Data By Query Conditions
	 * 
	 * @param queryBean
	 * 
	 * @return Data Array
	 * 
	 * @throws Exception
	 * 
	 * @model type="IBusinessDomain" containment="true"
	 */
	DataObject[] query(DataQueryBean queryBean) throws Exception;

	/**
	 * Get Count By Query Conditions
	 * 
	 * @param queryBean
	 * 
	 * @return int
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	int queryCount(DataQueryBean queryBean) throws Exception;

	/**
	 * Query BusinessDomain Selective
	 * 
	 * @param queryBean
	 * 
	 * @return Map[]
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	Map<String, Object>[] querySelective(DataQueryBean queryBean)
			throws Exception;

	/**
	 * Synchronize Data By Query Conditions
	 * 
	 * @param datas
	 * @param queryBean
	 * 
	 * @throws Exception
	 * 
	 * @model
	 */
	void synchronize(DataObject[] datas, DataQueryBean queryBean)
			throws Exception;

	/**
	 * Synchronize Data
	 * 
	 * @param datas
	 * @param queryBean
	 * @param callBack
	 * @throws Exception
	 * 
	 * @model
	 */
	void synchronize(DataObject[] aBusinessDomains, DataQueryBean queryBean,
			ISynchronizeCallback<DataObject> callBack) throws Exception;

}
