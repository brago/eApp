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
 * The base model interface for the EmpPersonalDetails service. Represents a row in the &quot;emp_personal_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpPersonalDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpPersonalDetailsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpPersonalDetails
 * @see com.rknowsys.eapp.hrm.model.impl.EmpPersonalDetailsImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpPersonalDetailsModelImpl
 * @generated
 */
public interface EmpPersonalDetailsModel extends BaseModel<EmpPersonalDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a EmpPersonalDetails model instance should use the {@link EmpPersonalDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this EmpPersonalDetails.
	 *
	 * @return the primary key of this EmpPersonalDetails
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this EmpPersonalDetails.
	 *
	 * @param primaryKey the primary key of this EmpPersonalDetails
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp personal details ID of this EmpPersonalDetails.
	 *
	 * @return the emp personal details ID of this EmpPersonalDetails
	 */
	public long getEmpPersonalDetailsId();

	/**
	 * Sets the emp personal details ID of this EmpPersonalDetails.
	 *
	 * @param empPersonalDetailsId the emp personal details ID of this EmpPersonalDetails
	 */
	public void setEmpPersonalDetailsId(long empPersonalDetailsId);

	/**
	 * Returns the employee ID of this EmpPersonalDetails.
	 *
	 * @return the employee ID of this EmpPersonalDetails
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this EmpPersonalDetails.
	 *
	 * @param employeeId the employee ID of this EmpPersonalDetails
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this EmpPersonalDetails.
	 *
	 * @return the group ID of this EmpPersonalDetails
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this EmpPersonalDetails.
	 *
	 * @param groupId the group ID of this EmpPersonalDetails
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this EmpPersonalDetails.
	 *
	 * @return the company ID of this EmpPersonalDetails
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this EmpPersonalDetails.
	 *
	 * @param companyId the company ID of this EmpPersonalDetails
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this EmpPersonalDetails.
	 *
	 * @return the user ID of this EmpPersonalDetails
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this EmpPersonalDetails.
	 *
	 * @param userId the user ID of this EmpPersonalDetails
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this EmpPersonalDetails.
	 *
	 * @return the user uuid of this EmpPersonalDetails
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this EmpPersonalDetails.
	 *
	 * @param userUuid the user uuid of this EmpPersonalDetails
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this EmpPersonalDetails.
	 *
	 * @return the create date of this EmpPersonalDetails
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this EmpPersonalDetails.
	 *
	 * @param createDate the create date of this EmpPersonalDetails
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this EmpPersonalDetails.
	 *
	 * @return the modified date of this EmpPersonalDetails
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this EmpPersonalDetails.
	 *
	 * @param modifiedDate the modified date of this EmpPersonalDetails
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this EmpPersonalDetails.
	 *
	 * @return the first name of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this EmpPersonalDetails.
	 *
	 * @param firstName the first name of this EmpPersonalDetails
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this EmpPersonalDetails.
	 *
	 * @return the last name of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this EmpPersonalDetails.
	 *
	 * @param lastName the last name of this EmpPersonalDetails
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the middle name of this EmpPersonalDetails.
	 *
	 * @return the middle name of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this EmpPersonalDetails.
	 *
	 * @param middleName the middle name of this EmpPersonalDetails
	 */
	public void setMiddleName(String middleName);

	/**
	 * Returns the employee no of this EmpPersonalDetails.
	 *
	 * @return the employee no of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getEmployeeNo();

	/**
	 * Sets the employee no of this EmpPersonalDetails.
	 *
	 * @param employeeNo the employee no of this EmpPersonalDetails
	 */
	public void setEmployeeNo(String employeeNo);

	/**
	 * Returns the other ID of this EmpPersonalDetails.
	 *
	 * @return the other ID of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getOtherId();

	/**
	 * Sets the other ID of this EmpPersonalDetails.
	 *
	 * @param otherId the other ID of this EmpPersonalDetails
	 */
	public void setOtherId(String otherId);

	/**
	 * Returns the license no of this EmpPersonalDetails.
	 *
	 * @return the license no of this EmpPersonalDetails
	 */
	@AutoEscape
	public String getLicenseNo();

	/**
	 * Sets the license no of this EmpPersonalDetails.
	 *
	 * @param licenseNo the license no of this EmpPersonalDetails
	 */
	public void setLicenseNo(String licenseNo);

	/**
	 * Returns the license exp date of this EmpPersonalDetails.
	 *
	 * @return the license exp date of this EmpPersonalDetails
	 */
	public Date getLicenseExpDate();

	/**
	 * Sets the license exp date of this EmpPersonalDetails.
	 *
	 * @param licenseExpDate the license exp date of this EmpPersonalDetails
	 */
	public void setLicenseExpDate(Date licenseExpDate);

	/**
	 * Returns the gender of this EmpPersonalDetails.
	 *
	 * @return the gender of this EmpPersonalDetails
	 */
	public long getGender();

	/**
	 * Sets the gender of this EmpPersonalDetails.
	 *
	 * @param gender the gender of this EmpPersonalDetails
	 */
	public void setGender(long gender);

	/**
	 * Returns the marital status of this EmpPersonalDetails.
	 *
	 * @return the marital status of this EmpPersonalDetails
	 */
	public long getMaritalStatus();

	/**
	 * Sets the marital status of this EmpPersonalDetails.
	 *
	 * @param maritalStatus the marital status of this EmpPersonalDetails
	 */
	public void setMaritalStatus(long maritalStatus);

	/**
	 * Returns the nationality ID of this EmpPersonalDetails.
	 *
	 * @return the nationality ID of this EmpPersonalDetails
	 */
	public long getNationalityId();

	/**
	 * Sets the nationality ID of this EmpPersonalDetails.
	 *
	 * @param nationalityId the nationality ID of this EmpPersonalDetails
	 */
	public void setNationalityId(long nationalityId);

	/**
	 * Returns the date of birth of this EmpPersonalDetails.
	 *
	 * @return the date of birth of this EmpPersonalDetails
	 */
	public Date getDateOfBirth();

	/**
	 * Sets the date of birth of this EmpPersonalDetails.
	 *
	 * @param dateOfBirth the date of birth of this EmpPersonalDetails
	 */
	public void setDateOfBirth(Date dateOfBirth);

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
	public int compareTo(EmpPersonalDetails empPersonalDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpPersonalDetails> toCacheModel();

	@Override
	public EmpPersonalDetails toEscapedModel();

	@Override
	public EmpPersonalDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}