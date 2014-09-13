/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SalaryComponent service. Represents a row in the &quot;salary_component&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.SalaryComponentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.SalaryComponentImpl}.
 * </p>
 *
 * @author rknowsys
 * @see SalaryComponent
 * @see com.rknowsys.eapp.hrm.model.impl.SalaryComponentImpl
 * @see com.rknowsys.eapp.hrm.model.impl.SalaryComponentModelImpl
 * @generated
 */
public interface SalaryComponentModel extends BaseModel<SalaryComponent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a salary component model instance should use the {@link SalaryComponent} interface instead.
	 */

	/**
	 * Returns the primary key of this salary component.
	 *
	 * @return the primary key of this salary component
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this salary component.
	 *
	 * @param primaryKey the primary key of this salary component
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the salary component ID of this salary component.
	 *
	 * @return the salary component ID of this salary component
	 */
	public long getSalaryComponentId();

	/**
	 * Sets the salary component ID of this salary component.
	 *
	 * @param salaryComponentId the salary component ID of this salary component
	 */
	public void setSalaryComponentId(long salaryComponentId);

	/**
	 * Returns the employee ID of this salary component.
	 *
	 * @return the employee ID of this salary component
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this salary component.
	 *
	 * @param employeeId the employee ID of this salary component
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the company ID of this salary component.
	 *
	 * @return the company ID of this salary component
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this salary component.
	 *
	 * @param companyId the company ID of this salary component
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this salary component.
	 *
	 * @return the group ID of this salary component
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this salary component.
	 *
	 * @param groupId the group ID of this salary component
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this salary component.
	 *
	 * @return the create date of this salary component
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this salary component.
	 *
	 * @param createDate the create date of this salary component
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this salary component.
	 *
	 * @return the modified date of this salary component
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this salary component.
	 *
	 * @param modifiedDate the modified date of this salary component
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this salary component.
	 *
	 * @return the user ID of this salary component
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this salary component.
	 *
	 * @param userId the user ID of this salary component
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this salary component.
	 *
	 * @return the user uuid of this salary component
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this salary component.
	 *
	 * @param userUuid the user uuid of this salary component
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the component name of this salary component.
	 *
	 * @return the component name of this salary component
	 */
	@AutoEscape
	public String getComponentName();

	/**
	 * Sets the component name of this salary component.
	 *
	 * @param componentName the component name of this salary component
	 */
	public void setComponentName(String componentName);

	/**
	 * Returns the type of this salary component.
	 *
	 * @return the type of this salary component
	 */
	public boolean getType();

	/**
	 * Returns <code>true</code> if this salary component is type.
	 *
	 * @return <code>true</code> if this salary component is type; <code>false</code> otherwise
	 */
	public boolean isType();

	/**
	 * Sets whether this salary component is type.
	 *
	 * @param type the type of this salary component
	 */
	public void setType(boolean type);

	/**
	 * Returns the only c t c of this salary component.
	 *
	 * @return the only c t c of this salary component
	 */
	public boolean getOnlyCTC();

	/**
	 * Returns <code>true</code> if this salary component is only c t c.
	 *
	 * @return <code>true</code> if this salary component is only c t c; <code>false</code> otherwise
	 */
	public boolean isOnlyCTC();

	/**
	 * Sets whether this salary component is only c t c.
	 *
	 * @param onlyCTC the only c t c of this salary component
	 */
	public void setOnlyCTC(boolean onlyCTC);

	/**
	 * Returns the value type of this salary component.
	 *
	 * @return the value type of this salary component
	 */
	@AutoEscape
	public String getValueType();

	/**
	 * Sets the value type of this salary component.
	 *
	 * @param valueType the value type of this salary component
	 */
	public void setValueType(String valueType);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(SalaryComponent salaryComponent);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SalaryComponent> toCacheModel();

	@Override
	public SalaryComponent toEscapedModel();

	@Override
	public SalaryComponent toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}