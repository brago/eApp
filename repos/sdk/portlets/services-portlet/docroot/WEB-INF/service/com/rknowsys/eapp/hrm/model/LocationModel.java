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
 * The base model interface for the Location service. Represents a row in the &quot;location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.LocationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.LocationImpl}.
 * </p>
 *
 * @author rknowsys
 * @see Location
 * @see com.rknowsys.eapp.hrm.model.impl.LocationImpl
 * @see com.rknowsys.eapp.hrm.model.impl.LocationModelImpl
 * @generated
 */
public interface LocationModel extends BaseModel<Location> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a location model instance should use the {@link Location} interface instead.
	 */

	/**
	 * Returns the primary key of this location.
	 *
	 * @return the primary key of this location
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this location.
	 *
	 * @param primaryKey the primary key of this location
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the location ID of this location.
	 *
	 * @return the location ID of this location
	 */
	public long getLocationId();

	/**
	 * Sets the location ID of this location.
	 *
	 * @param locationId the location ID of this location
	 */
	public void setLocationId(long locationId);

	/**
	 * Returns the company ID of this location.
	 *
	 * @return the company ID of this location
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this location.
	 *
	 * @param companyId the company ID of this location
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this location.
	 *
	 * @return the group ID of this location
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this location.
	 *
	 * @param groupId the group ID of this location
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this location.
	 *
	 * @return the create date of this location
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this location.
	 *
	 * @param createDate the create date of this location
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this location.
	 *
	 * @return the modified date of this location
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this location.
	 *
	 * @param modifiedDate the modified date of this location
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this location.
	 *
	 * @return the user ID of this location
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this location.
	 *
	 * @param userId the user ID of this location
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this location.
	 *
	 * @return the user uuid of this location
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this location.
	 *
	 * @param userUuid the user uuid of this location
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the name of this location.
	 *
	 * @return the name of this location
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this location.
	 *
	 * @param name the name of this location
	 */
	public void setName(String name);

	/**
	 * Returns the country of this location.
	 *
	 * @return the country of this location
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this location.
	 *
	 * @param country the country of this location
	 */
	public void setCountry(String country);

	/**
	 * Returns the state of this location.
	 *
	 * @return the state of this location
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this location.
	 *
	 * @param state the state of this location
	 */
	public void setState(String state);

	/**
	 * Returns the city of this location.
	 *
	 * @return the city of this location
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this location.
	 *
	 * @param city the city of this location
	 */
	public void setCity(String city);

	/**
	 * Returns the address of this location.
	 *
	 * @return the address of this location
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this location.
	 *
	 * @param address the address of this location
	 */
	public void setAddress(String address);

	/**
	 * Returns the postalcode of this location.
	 *
	 * @return the postalcode of this location
	 */
	@AutoEscape
	public String getPostalcode();

	/**
	 * Sets the postalcode of this location.
	 *
	 * @param postalcode the postalcode of this location
	 */
	public void setPostalcode(String postalcode);

	/**
	 * Returns the phone of this location.
	 *
	 * @return the phone of this location
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this location.
	 *
	 * @param phone the phone of this location
	 */
	public void setPhone(String phone);

	/**
	 * Returns the fax of this location.
	 *
	 * @return the fax of this location
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this location.
	 *
	 * @param fax the fax of this location
	 */
	public void setFax(String fax);

	/**
	 * Returns the notes of this location.
	 *
	 * @return the notes of this location
	 */
	@AutoEscape
	public String getNotes();

	/**
	 * Sets the notes of this location.
	 *
	 * @param notes the notes of this location
	 */
	public void setNotes(String notes);

	/**
	 * Returns the job ID of this location.
	 *
	 * @return the job ID of this location
	 */
	public long getJobId();

	/**
	 * Sets the job ID of this location.
	 *
	 * @param jobId the job ID of this location
	 */
	public void setJobId(long jobId);

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
	public int compareTo(Location location);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Location> toCacheModel();

	@Override
	public Location toEscapedModel();

	@Override
	public Location toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}