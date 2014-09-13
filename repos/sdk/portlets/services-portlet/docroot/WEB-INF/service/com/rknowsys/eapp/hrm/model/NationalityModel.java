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
 * The base model interface for the Nationality service. Represents a row in the &quot;hrm_Nationality&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.NationalityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.NationalityImpl}.
 * </p>
 *
 * @author rknowsys
 * @see Nationality
 * @see com.rknowsys.eapp.hrm.model.impl.NationalityImpl
 * @see com.rknowsys.eapp.hrm.model.impl.NationalityModelImpl
 * @generated
 */
public interface NationalityModel extends BaseModel<Nationality> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nationality model instance should use the {@link Nationality} interface instead.
	 */

	/**
	 * Returns the primary key of this nationality.
	 *
	 * @return the primary key of this nationality
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nationality.
	 *
	 * @param primaryKey the primary key of this nationality
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the nationality ID of this nationality.
	 *
	 * @return the nationality ID of this nationality
	 */
	public long getNationalityId();

	/**
	 * Sets the nationality ID of this nationality.
	 *
	 * @param nationalityId the nationality ID of this nationality
	 */
	public void setNationalityId(long nationalityId);

	/**
	 * Returns the group ID of this nationality.
	 *
	 * @return the group ID of this nationality
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this nationality.
	 *
	 * @param groupId the group ID of this nationality
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this nationality.
	 *
	 * @return the company ID of this nationality
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this nationality.
	 *
	 * @param companyId the company ID of this nationality
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this nationality.
	 *
	 * @return the user ID of this nationality
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this nationality.
	 *
	 * @param userId the user ID of this nationality
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this nationality.
	 *
	 * @return the user uuid of this nationality
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this nationality.
	 *
	 * @param userUuid the user uuid of this nationality
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this nationality.
	 *
	 * @return the create date of this nationality
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this nationality.
	 *
	 * @param createDate the create date of this nationality
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this nationality.
	 *
	 * @return the modified date of this nationality
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this nationality.
	 *
	 * @param modifiedDate the modified date of this nationality
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this nationality.
	 *
	 * @return the name of this nationality
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this nationality.
	 *
	 * @param Name the name of this nationality
	 */
	public void setName(String Name);

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
	public int compareTo(Nationality nationality);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Nationality> toCacheModel();

	@Override
	public Nationality toEscapedModel();

	@Override
	public Nationality toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}