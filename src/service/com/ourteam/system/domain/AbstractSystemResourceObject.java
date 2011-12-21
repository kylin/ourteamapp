package com.ourteam.system.domain;

import java.io.Serializable;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ourteam.system.dao.SysResource;
import com.ourteam.system.dao.SysResourceProperty;
import com.ourteam.system.dao.SysResourceType;
import com.ourteam.system.dao.SysResourceTypeIdEnum;
import com.ourteam.system.service.ISysResourceService;
import com.ourteam.system.service.SysResourceServiceFactory;

abstract public class AbstractSystemResourceObject extends SystemResource
		implements Serializable {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractSystemResourceObject.class);

	private static ISysResourceService SYS_RESOURCE_SERVICE = SysResourceServiceFactory
			.getSysResourceService();

	abstract protected SysResourceTypeIdEnum getSysResourceTypeIdEnum();

	public AbstractSystemResourceObject() {
		super();
		this.setTypeId(Long.valueOf(getSysResourceTypeIdEnum().getValue()));
		initSysProperties();
	}

	public AbstractSystemResourceObject(SystemResource aResource) {
		super(aResource.convertToSysResource());
		this.setTypeId(Long.valueOf(getSysResourceTypeIdEnum().getValue()));
		this.setProperties(aResource.getProperties());
	}

	protected void initSysProperties() {
		try {

			SysResourceType[] sysResourceTypes = SYS_RESOURCE_SERVICE
					.getSysResourcePropertyDefines(getSysResourceTypeIdEnum()
							.getValue());

			SystemResourceProperty[] properties = new SystemResourceProperty[sysResourceTypes.length];

			for (int i = 0; i < sysResourceTypes.length; i++) {
				SysResourceType sysResourceType = sysResourceTypes[i];

				SysResourceProperty resourceProperty = new SysResourceProperty();

				resourceProperty.setResourcePropertyCode(sysResourceType
						.getConfigCode());
				resourceProperty.setResourcePropertyName(sysResourceType
						.getConfigName());
				resourceProperty.setResourcePropertyOrder(Integer.valueOf(
						sysResourceType.getSort()));

				properties[i] = new SystemResourceProperty(resourceProperty);
			}

			this.setProperties(properties);

		} catch (Exception e) {
			logger.error(e);
		}
	}

	public SysResource converToDataBean() {

		this.setTypeId(Long.valueOf(getSysResourceTypeIdEnum().getValue()));

		return super.convertToSysResource();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ourteam.system.domain.SystemResource#getProperties()
	 */
	public SystemResourceProperty[] getProperties() {

		SystemResourceProperty[] resourceProperties = super.getProperties();

		if (ArrayUtils.isEmpty(resourceProperties)) {
			return new SystemResourceProperty[0];
		}

		try {

			for (int j = 0; j < resourceProperties.length; j++) {
				SystemResourceProperty sysResourceProperty = resourceProperties[j];
				if (PropertyUtils.isReadable(this, sysResourceProperty
						.getPropertyCode())) {

					Object value = PropertyUtils.getProperty(this,
							sysResourceProperty.getPropertyCode());
					if (value != null) {
						sysResourceProperty.setPropertyValue(String
								.valueOf(value));
					} else {
						sysResourceProperty.setPropertyValue(null);
					}

				}
			}
			return super.getProperties();

		} catch (Exception e) {
			logger.error(e);
			return super.getProperties();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ourteam.system.domain.SystemResource#setProperties(com.ourteam.system
	 * .domain.SystemResourceProperty[])
	 */
	public void setProperties(SystemResourceProperty[] properties) {

		if (ArrayUtils.isEmpty(properties)) {
			super.setProperties(new SystemResourceProperty[0]);
		} else {
			try {
				for (int j = 0; j < properties.length; j++) {
					SystemResourceProperty sysResourceProperty = properties[j];
					if (PropertyUtils.isWriteable(this, sysResourceProperty
							.getPropertyCode())) {

						Class valueType = PropertyUtils.getPropertyType(this,
								sysResourceProperty.getPropertyCode());

						Object value = ConvertUtils.convert(sysResourceProperty
								.getPropertyValue(), valueType);

						PropertyUtils.setProperty(this, sysResourceProperty
								.getPropertyCode(), value);
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}

			super.setProperties(properties);
		}
	}

}
