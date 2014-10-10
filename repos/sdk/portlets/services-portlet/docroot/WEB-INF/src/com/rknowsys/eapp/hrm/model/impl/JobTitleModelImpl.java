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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.JobTitle;
import com.rknowsys.eapp.hrm.model.JobTitleModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the JobTitle service. Represents a row in the &quot;job_title&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.JobTitleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobTitleImpl}.
 * </p>
 *
 * @author rknowsys
 * @see JobTitleImpl
 * @see com.rknowsys.eapp.hrm.model.JobTitle
 * @see com.rknowsys.eapp.hrm.model.JobTitleModel
 * @generated
 */
public class JobTitleModelImpl extends BaseModelImpl<JobTitle>
	implements JobTitleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job title model instance should use the {@link com.rknowsys.eapp.hrm.model.JobTitle} interface instead.
	 */
	public static final String TABLE_NAME = "job_title";
	public static final Object[][] TABLE_COLUMNS = {
			{ "jobTitleId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "notes", Types.VARCHAR },
			{ "specification", Types.VARCHAR },
			{ "jobId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table job_title (jobTitleId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,employeeId LONG,title VARCHAR(75) null,description VARCHAR(75) null,notes VARCHAR(75) null,specification VARCHAR(75) null,jobId LONG)";
	public static final String TABLE_SQL_DROP = "drop table job_title";
	public static final String ORDER_BY_JPQL = " ORDER BY jobTitle.jobTitleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY job_title.jobTitleId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.JobTitle"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.JobTitle"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.JobTitle"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long JOBTITLEID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.JobTitle"));

	public JobTitleModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jobTitleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobTitleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobTitleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JobTitle.class;
	}

	@Override
	public String getModelClassName() {
		return JobTitle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobTitleId", getJobTitleId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("notes", getNotes());
		attributes.put("specification", getSpecification());
		attributes.put("jobId", getJobId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobTitleId = (Long)attributes.get("jobTitleId");

		if (jobTitleId != null) {
			setJobTitleId(jobTitleId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}

		String specification = (String)attributes.get("specification");

		if (specification != null) {
			setSpecification(specification);
		}

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}
	}

	@Override
	public long getJobTitleId() {
		return _jobTitleId;
	}

	@Override
	public void setJobTitleId(long jobTitleId) {
		_columnBitmask |= JOBTITLEID_COLUMN_BITMASK;

		if (!_setOriginalJobTitleId) {
			_setOriginalJobTitleId = true;

			_originalJobTitleId = _jobTitleId;
		}

		_jobTitleId = jobTitleId;
	}

	public long getOriginalJobTitleId() {
		return _originalJobTitleId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeId) {
			_setOriginalEmployeeId = true;

			_originalEmployeeId = _employeeId;
		}

		_employeeId = employeeId;
	}

	public long getOriginalEmployeeId() {
		return _originalEmployeeId;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getNotes() {
		if (_notes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notes;
		}
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;
	}

	@Override
	public String getSpecification() {
		if (_specification == null) {
			return StringPool.BLANK;
		}
		else {
			return _specification;
		}
	}

	@Override
	public void setSpecification(String specification) {
		_specification = specification;
	}

	@Override
	public long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			JobTitle.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JobTitle toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (JobTitle)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		JobTitleImpl jobTitleImpl = new JobTitleImpl();

		jobTitleImpl.setJobTitleId(getJobTitleId());
		jobTitleImpl.setCompanyId(getCompanyId());
		jobTitleImpl.setGroupId(getGroupId());
		jobTitleImpl.setCreateDate(getCreateDate());
		jobTitleImpl.setModifiedDate(getModifiedDate());
		jobTitleImpl.setUserId(getUserId());
		jobTitleImpl.setEmployeeId(getEmployeeId());
		jobTitleImpl.setTitle(getTitle());
		jobTitleImpl.setDescription(getDescription());
		jobTitleImpl.setNotes(getNotes());
		jobTitleImpl.setSpecification(getSpecification());
		jobTitleImpl.setJobId(getJobId());

		jobTitleImpl.resetOriginalValues();

		return jobTitleImpl;
	}

	@Override
	public int compareTo(JobTitle jobTitle) {
		long primaryKey = jobTitle.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobTitle)) {
			return false;
		}

		JobTitle jobTitle = (JobTitle)obj;

		long primaryKey = jobTitle.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		JobTitleModelImpl jobTitleModelImpl = this;

		jobTitleModelImpl._originalJobTitleId = jobTitleModelImpl._jobTitleId;

		jobTitleModelImpl._setOriginalJobTitleId = false;

		jobTitleModelImpl._originalGroupId = jobTitleModelImpl._groupId;

		jobTitleModelImpl._setOriginalGroupId = false;

		jobTitleModelImpl._originalEmployeeId = jobTitleModelImpl._employeeId;

		jobTitleModelImpl._setOriginalEmployeeId = false;

		jobTitleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<JobTitle> toCacheModel() {
		JobTitleCacheModel jobTitleCacheModel = new JobTitleCacheModel();

		jobTitleCacheModel.jobTitleId = getJobTitleId();

		jobTitleCacheModel.companyId = getCompanyId();

		jobTitleCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			jobTitleCacheModel.createDate = createDate.getTime();
		}
		else {
			jobTitleCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jobTitleCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			jobTitleCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jobTitleCacheModel.userId = getUserId();

		jobTitleCacheModel.employeeId = getEmployeeId();

		jobTitleCacheModel.title = getTitle();

		String title = jobTitleCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			jobTitleCacheModel.title = null;
		}

		jobTitleCacheModel.description = getDescription();

		String description = jobTitleCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			jobTitleCacheModel.description = null;
		}

		jobTitleCacheModel.notes = getNotes();

		String notes = jobTitleCacheModel.notes;

		if ((notes != null) && (notes.length() == 0)) {
			jobTitleCacheModel.notes = null;
		}

		jobTitleCacheModel.specification = getSpecification();

		String specification = jobTitleCacheModel.specification;

		if ((specification != null) && (specification.length() == 0)) {
			jobTitleCacheModel.specification = null;
		}

		jobTitleCacheModel.jobId = getJobId();

		return jobTitleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{jobTitleId=");
		sb.append(getJobTitleId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append(", specification=");
		sb.append(getSpecification());
		sb.append(", jobId=");
		sb.append(getJobId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.JobTitle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobTitleId</column-name><column-value><![CDATA[");
		sb.append(getJobTitleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specification</column-name><column-value><![CDATA[");
		sb.append(getSpecification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = JobTitle.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			JobTitle.class
		};
	private long _jobTitleId;
	private long _originalJobTitleId;
	private boolean _setOriginalJobTitleId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private String _title;
	private String _description;
	private String _notes;
	private String _specification;
	private long _jobId;
	private long _columnBitmask;
	private JobTitle _escapedModel;
}