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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Document}.
 * </p>
 *
 * @author rknowsys
 * @see Document
 * @generated
 */
public class DocumentWrapper implements Document, ModelWrapper<Document> {
	public DocumentWrapper(Document document) {
		_document = document;
	}

	@Override
	public Class<?> getModelClass() {
		return Document.class;
	}

	@Override
	public String getModelClassName() {
		return Document.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("docTopic", getDocTopic());
		attributes.put("docCategory", getDocCategory());
		attributes.put("description", getDescription());
		attributes.put("publishTo", getPublishTo());
		attributes.put("publishDate", getPublishDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String docTopic = (String)attributes.get("docTopic");

		if (docTopic != null) {
			setDocTopic(docTopic);
		}

		String docCategory = (String)attributes.get("docCategory");

		if (docCategory != null) {
			setDocCategory(docCategory);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String publishTo = (String)attributes.get("publishTo");

		if (publishTo != null) {
			setPublishTo(publishTo);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}
	}

	/**
	* Returns the primary key of this document.
	*
	* @return the primary key of this document
	*/
	@Override
	public long getPrimaryKey() {
		return _document.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document.
	*
	* @param primaryKey the primary key of this document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_document.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this document.
	*
	* @return the ID of this document
	*/
	@Override
	public long getId() {
		return _document.getId();
	}

	/**
	* Sets the ID of this document.
	*
	* @param id the ID of this document
	*/
	@Override
	public void setId(long id) {
		_document.setId(id);
	}

	/**
	* Returns the company ID of this document.
	*
	* @return the company ID of this document
	*/
	@Override
	public long getCompanyId() {
		return _document.getCompanyId();
	}

	/**
	* Sets the company ID of this document.
	*
	* @param companyId the company ID of this document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_document.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this document.
	*
	* @return the group ID of this document
	*/
	@Override
	public long getGroupId() {
		return _document.getGroupId();
	}

	/**
	* Sets the group ID of this document.
	*
	* @param groupId the group ID of this document
	*/
	@Override
	public void setGroupId(long groupId) {
		_document.setGroupId(groupId);
	}

	/**
	* Returns the create date of this document.
	*
	* @return the create date of this document
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _document.getCreateDate();
	}

	/**
	* Sets the create date of this document.
	*
	* @param createDate the create date of this document
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_document.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this document.
	*
	* @return the modified date of this document
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _document.getModifiedDate();
	}

	/**
	* Sets the modified date of this document.
	*
	* @param modifiedDate the modified date of this document
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_document.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the user ID of this document.
	*
	* @return the user ID of this document
	*/
	@Override
	public long getUserId() {
		return _document.getUserId();
	}

	/**
	* Sets the user ID of this document.
	*
	* @param userId the user ID of this document
	*/
	@Override
	public void setUserId(long userId) {
		_document.setUserId(userId);
	}

	/**
	* Returns the user uuid of this document.
	*
	* @return the user uuid of this document
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _document.getUserUuid();
	}

	/**
	* Sets the user uuid of this document.
	*
	* @param userUuid the user uuid of this document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_document.setUserUuid(userUuid);
	}

	/**
	* Returns the doc topic of this document.
	*
	* @return the doc topic of this document
	*/
	@Override
	public java.lang.String getDocTopic() {
		return _document.getDocTopic();
	}

	/**
	* Sets the doc topic of this document.
	*
	* @param docTopic the doc topic of this document
	*/
	@Override
	public void setDocTopic(java.lang.String docTopic) {
		_document.setDocTopic(docTopic);
	}

	/**
	* Returns the doc category of this document.
	*
	* @return the doc category of this document
	*/
	@Override
	public java.lang.String getDocCategory() {
		return _document.getDocCategory();
	}

	/**
	* Sets the doc category of this document.
	*
	* @param docCategory the doc category of this document
	*/
	@Override
	public void setDocCategory(java.lang.String docCategory) {
		_document.setDocCategory(docCategory);
	}

	/**
	* Returns the description of this document.
	*
	* @return the description of this document
	*/
	@Override
	public java.lang.String getDescription() {
		return _document.getDescription();
	}

	/**
	* Sets the description of this document.
	*
	* @param description the description of this document
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_document.setDescription(description);
	}

	/**
	* Returns the publish to of this document.
	*
	* @return the publish to of this document
	*/
	@Override
	public java.lang.String getPublishTo() {
		return _document.getPublishTo();
	}

	/**
	* Sets the publish to of this document.
	*
	* @param publishTo the publish to of this document
	*/
	@Override
	public void setPublishTo(java.lang.String publishTo) {
		_document.setPublishTo(publishTo);
	}

	/**
	* Returns the publish date of this document.
	*
	* @return the publish date of this document
	*/
	@Override
	public java.util.Date getPublishDate() {
		return _document.getPublishDate();
	}

	/**
	* Sets the publish date of this document.
	*
	* @param publishDate the publish date of this document
	*/
	@Override
	public void setPublishDate(java.util.Date publishDate) {
		_document.setPublishDate(publishDate);
	}

	@Override
	public boolean isNew() {
		return _document.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_document.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _document.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_document.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _document.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _document.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_document.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _document.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_document.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_document.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_document.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentWrapper((Document)_document.clone());
	}

	@Override
	public int compareTo(com.rknowsys.eapp.hrm.model.Document document) {
		return _document.compareTo(document);
	}

	@Override
	public int hashCode() {
		return _document.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rknowsys.eapp.hrm.model.Document> toCacheModel() {
		return _document.toCacheModel();
	}

	@Override
	public com.rknowsys.eapp.hrm.model.Document toEscapedModel() {
		return new DocumentWrapper(_document.toEscapedModel());
	}

	@Override
	public com.rknowsys.eapp.hrm.model.Document toUnescapedModel() {
		return new DocumentWrapper(_document.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _document.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _document.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_document.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentWrapper)) {
			return false;
		}

		DocumentWrapper documentWrapper = (DocumentWrapper)obj;

		if (Validator.equals(_document, documentWrapper._document)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Document getWrappedDocument() {
		return _document;
	}

	@Override
	public Document getWrappedModel() {
		return _document;
	}

	@Override
	public void resetOriginalValues() {
		_document.resetOriginalValues();
	}

	private Document _document;
}