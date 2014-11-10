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
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmpContactDetails service. Represents a row in the &quot;emp_contact_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpContactDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpContactDetailsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpContactDetails
 * @see com.rknowsys.eapp.hrm.model.impl.EmpContactDetailsImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpContactDetailsModelImpl
 * @generated
 */
public interface EmpContactDetailsModel extends BaseModel<EmpContactDetails>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a EmpContactDetails model instance should use the {@link EmpContactDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this EmpContactDetails.
	 *
	 * @return the primary key of this EmpContactDetails
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this EmpContactDetails.
	 *
	 * @param primaryKey the primary key of this EmpContactDetails
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp contact details ID of this EmpContactDetails.
	 *
	 * @return the emp contact details ID of this EmpContactDetails
	 */
	public long getEmpContactDetailsId();

	/**
	 * Sets the emp contact details ID of this EmpContactDetails.
	 *
	 * @param empContactDetailsId the emp contact details ID of this EmpContactDetails
	 */
	public void setEmpContactDetailsId(long empContactDetailsId);

	/**
	 * Returns the employee ID of this EmpContactDetails.
	 *
	 * @return the employee ID of this EmpContactDetails
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this EmpContactDetails.
	 *
	 * @param employeeId the employee ID of this EmpContactDetails
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this EmpContactDetails.
	 *
	 * @return the group ID of this EmpContactDetails
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this EmpContactDetails.
	 *
	 * @param groupId the group ID of this EmpContactDetails
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this EmpContactDetails.
	 *
	 * @return the company ID of this EmpContactDetails
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this EmpContactDetails.
	 *
	 * @param companyId the company ID of this EmpContactDetails
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this EmpContactDetails.
	 *
	 * @return the user ID of this EmpContactDetails
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this EmpContactDetails.
	 *
	 * @param userId the user ID of this EmpContactDetails
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this EmpContactDetails.
	 *
	 * @return the user uuid of this EmpContactDetails
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this EmpContactDetails.
	 *
	 * @param userUuid the user uuid of this EmpContactDetails
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this EmpContactDetails.
	 *
	 * @return the user name of this EmpContactDetails
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this EmpContactDetails.
	 *
	 * @param userName the user name of this EmpContactDetails
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this EmpContactDetails.
	 *
	 * @return the create date of this EmpContactDetails
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this EmpContactDetails.
	 *
	 * @param createDate the create date of this EmpContactDetails
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this EmpContactDetails.
	 *
	 * @return the modified date of this EmpContactDetails
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this EmpContactDetails.
	 *
	 * @param modifiedDate the modified date of this EmpContactDetails
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the address street1 of this EmpContactDetails.
	 *
	 * @return the address street1 of this EmpContactDetails
	 */
	@AutoEscape
	public String getAddressStreet1();

	/**
	 * Sets the address street1 of this EmpContactDetails.
	 *
	 * @param addressStreet1 the address street1 of this EmpContactDetails
	 */
	public void setAddressStreet1(String addressStreet1);

	/**
	 * Returns the address street2 of this EmpContactDetails.
	 *
	 * @return the address street2 of this EmpContactDetails
	 */
	@AutoEscape
	public String getAddressStreet2();

	/**
	 * Sets the address street2 of this EmpContactDetails.
	 *
	 * @param addressStreet2 the address street2 of this EmpContactDetails
	 */
	public void setAddressStreet2(String addressStreet2);

	/**
	 * Returns the city of this EmpContactDetails.
	 *
	 * @return the city of this EmpContactDetails
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this EmpContactDetails.
	 *
	 * @param city the city of this EmpContactDetails
	 */
	public void setCity(String city);

	/**
	 * Returns the state of this EmpContactDetails.
	 *
	 * @return the state of this EmpContactDetails
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this EmpContactDetails.
	 *
	 * @param state the state of this EmpContactDetails
	 */
	public void setState(String state);

	/**
	 * Returns the postal code of this EmpContactDetails.
	 *
	 * @return the postal code of this EmpContactDetails
	 */
	@AutoEscape
	public String getPostalCode();

	/**
	 * Sets the postal code of this EmpContactDetails.
	 *
	 * @param postalCode the postal code of this EmpContactDetails
	 */
	public void setPostalCode(String postalCode);

	/**
	 * Returns the country of this EmpContactDetails.
	 *
	 * @return the country of this EmpContactDetails
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this EmpContactDetails.
	 *
	 * @param country the country of this EmpContactDetails
	 */
	public void setCountry(String country);

	/**
	 * Returns the home telephone of this EmpContactDetails.
	 *
	 * @return the home telephone of this EmpContactDetails
	 */
	@AutoEscape
	public String getHomeTelephone();

	/**
	 * Sets the home telephone of this EmpContactDetails.
	 *
	 * @param homeTelephone the home telephone of this EmpContactDetails
	 */
	public void setHomeTelephone(String homeTelephone);

	/**
	 * Returns the mobile of this EmpContactDetails.
	 *
	 * @return the mobile of this EmpContactDetails
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this EmpContactDetails.
	 *
	 * @param mobile the mobile of this EmpContactDetails
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the work telephone of this EmpContactDetails.
	 *
	 * @return the work telephone of this EmpContactDetails
	 */
	@AutoEscape
	public String getWorkTelephone();

	/**
	 * Sets the work telephone of this EmpContactDetails.
	 *
	 * @param workTelephone the work telephone of this EmpContactDetails
	 */
	public void setWorkTelephone(String workTelephone);

	/**
	 * Returns the work email of this EmpContactDetails.
	 *
	 * @return the work email of this EmpContactDetails
	 */
	@AutoEscape
	public String getWorkEmail();

	/**
	 * Sets the work email of this EmpContactDetails.
	 *
	 * @param workEmail the work email of this EmpContactDetails
	 */
	public void setWorkEmail(String workEmail);

	/**
	 * Returns the other email of this EmpContactDetails.
	 *
	 * @return the other email of this EmpContactDetails
	 */
	@AutoEscape
	public String getOtherEmail();

	/**
	 * Sets the other email of this EmpContactDetails.
	 *
	 * @param otherEmail the other email of this EmpContactDetails
	 */
	public void setOtherEmail(String otherEmail);

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
	public int compareTo(EmpContactDetails empContactDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpContactDetails> toCacheModel();

	@Override
	public EmpContactDetails toEscapedModel();

	@Override
	public EmpContactDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}