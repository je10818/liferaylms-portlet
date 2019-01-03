/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.lms.model.impl;

import com.liferay.lms.model.CourseTypeLearningActivity;
import com.liferay.lms.model.CourseTypeLearningActivityModel;
import com.liferay.lms.model.CourseTypeLearningActivitySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CourseTypeLearningActivity service. Represents a row in the &quot;Lms_CourseTypeLearningActivity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.lms.model.CourseTypeLearningActivityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CourseTypeLearningActivityImpl}.
 * </p>
 *
 * @author TLS
 * @see CourseTypeLearningActivityImpl
 * @see com.liferay.lms.model.CourseTypeLearningActivity
 * @see com.liferay.lms.model.CourseTypeLearningActivityModel
 * @generated
 */
public class CourseTypeLearningActivityModelImpl extends BaseModelImpl<CourseTypeLearningActivity>
	implements CourseTypeLearningActivityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a course type learning activity model instance should use the {@link com.liferay.lms.model.CourseTypeLearningActivity} interface instead.
	 */
	public static final String TABLE_NAME = "Lms_CourseTypeLearningActivity";
	public static final Object[][] TABLE_COLUMNS = {
			{ "courseTypeLearningActivityId", Types.BIGINT },
			{ "courseTypeId", Types.BIGINT },
			{ "learningActivityTypeId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table Lms_CourseTypeLearningActivity (courseTypeLearningActivityId LONG not null primary key,courseTypeId LONG,learningActivityTypeId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Lms_CourseTypeLearningActivity";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.lms.model.CourseTypeLearningActivity"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.lms.model.CourseTypeLearningActivity"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.lms.model.CourseTypeLearningActivity"),
			true);
	public static long COURSETYPEID_COLUMN_BITMASK = 1L;
	public static long COURSETYPELEARNINGACTIVITYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CourseTypeLearningActivity toModel(
		CourseTypeLearningActivitySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CourseTypeLearningActivity model = new CourseTypeLearningActivityImpl();

		model.setCourseTypeLearningActivityId(soapModel.getCourseTypeLearningActivityId());
		model.setCourseTypeId(soapModel.getCourseTypeId());
		model.setLearningActivityTypeId(soapModel.getLearningActivityTypeId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CourseTypeLearningActivity> toModels(
		CourseTypeLearningActivitySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CourseTypeLearningActivity> models = new ArrayList<CourseTypeLearningActivity>(soapModels.length);

		for (CourseTypeLearningActivitySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.lms.model.CourseTypeLearningActivity"));

	public CourseTypeLearningActivityModelImpl() {
	}

	public long getPrimaryKey() {
		return _courseTypeLearningActivityId;
	}

	public void setPrimaryKey(long primaryKey) {
		setCourseTypeLearningActivityId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_courseTypeLearningActivityId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return CourseTypeLearningActivity.class;
	}

	public String getModelClassName() {
		return CourseTypeLearningActivity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("courseTypeLearningActivityId",
			getCourseTypeLearningActivityId());
		attributes.put("courseTypeId", getCourseTypeId());
		attributes.put("learningActivityTypeId", getLearningActivityTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long courseTypeLearningActivityId = (Long)attributes.get(
				"courseTypeLearningActivityId");

		if (courseTypeLearningActivityId != null) {
			setCourseTypeLearningActivityId(courseTypeLearningActivityId);
		}

		Long courseTypeId = (Long)attributes.get("courseTypeId");

		if (courseTypeId != null) {
			setCourseTypeId(courseTypeId);
		}

		Long learningActivityTypeId = (Long)attributes.get(
				"learningActivityTypeId");

		if (learningActivityTypeId != null) {
			setLearningActivityTypeId(learningActivityTypeId);
		}
	}

	public long getCourseTypeLearningActivityId() {
		return _courseTypeLearningActivityId;
	}

	public void setCourseTypeLearningActivityId(
		long courseTypeLearningActivityId) {
		_columnBitmask |= COURSETYPELEARNINGACTIVITYID_COLUMN_BITMASK;

		if (!_setOriginalCourseTypeLearningActivityId) {
			_setOriginalCourseTypeLearningActivityId = true;

			_originalCourseTypeLearningActivityId = _courseTypeLearningActivityId;
		}

		_courseTypeLearningActivityId = courseTypeLearningActivityId;
	}

	public long getOriginalCourseTypeLearningActivityId() {
		return _originalCourseTypeLearningActivityId;
	}

	public long getCourseTypeId() {
		return _courseTypeId;
	}

	public void setCourseTypeId(long courseTypeId) {
		_columnBitmask |= COURSETYPEID_COLUMN_BITMASK;

		if (!_setOriginalCourseTypeId) {
			_setOriginalCourseTypeId = true;

			_originalCourseTypeId = _courseTypeId;
		}

		_courseTypeId = courseTypeId;
	}

	public long getOriginalCourseTypeId() {
		return _originalCourseTypeId;
	}

	public long getLearningActivityTypeId() {
		return _learningActivityTypeId;
	}

	public void setLearningActivityTypeId(long learningActivityTypeId) {
		_learningActivityTypeId = learningActivityTypeId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CourseTypeLearningActivity.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CourseTypeLearningActivity toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (CourseTypeLearningActivity)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		CourseTypeLearningActivityImpl courseTypeLearningActivityImpl = new CourseTypeLearningActivityImpl();

		courseTypeLearningActivityImpl.setCourseTypeLearningActivityId(getCourseTypeLearningActivityId());
		courseTypeLearningActivityImpl.setCourseTypeId(getCourseTypeId());
		courseTypeLearningActivityImpl.setLearningActivityTypeId(getLearningActivityTypeId());

		courseTypeLearningActivityImpl.resetOriginalValues();

		return courseTypeLearningActivityImpl;
	}

	public int compareTo(CourseTypeLearningActivity courseTypeLearningActivity) {
		long primaryKey = courseTypeLearningActivity.getPrimaryKey();

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
		if (obj == null) {
			return false;
		}

		CourseTypeLearningActivity courseTypeLearningActivity = null;

		try {
			courseTypeLearningActivity = (CourseTypeLearningActivity)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = courseTypeLearningActivity.getPrimaryKey();

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
		CourseTypeLearningActivityModelImpl courseTypeLearningActivityModelImpl = this;

		courseTypeLearningActivityModelImpl._originalCourseTypeLearningActivityId = courseTypeLearningActivityModelImpl._courseTypeLearningActivityId;

		courseTypeLearningActivityModelImpl._setOriginalCourseTypeLearningActivityId = false;

		courseTypeLearningActivityModelImpl._originalCourseTypeId = courseTypeLearningActivityModelImpl._courseTypeId;

		courseTypeLearningActivityModelImpl._setOriginalCourseTypeId = false;

		courseTypeLearningActivityModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CourseTypeLearningActivity> toCacheModel() {
		CourseTypeLearningActivityCacheModel courseTypeLearningActivityCacheModel =
			new CourseTypeLearningActivityCacheModel();

		courseTypeLearningActivityCacheModel.courseTypeLearningActivityId = getCourseTypeLearningActivityId();

		courseTypeLearningActivityCacheModel.courseTypeId = getCourseTypeId();

		courseTypeLearningActivityCacheModel.learningActivityTypeId = getLearningActivityTypeId();

		return courseTypeLearningActivityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{courseTypeLearningActivityId=");
		sb.append(getCourseTypeLearningActivityId());
		sb.append(", courseTypeId=");
		sb.append(getCourseTypeId());
		sb.append(", learningActivityTypeId=");
		sb.append(getLearningActivityTypeId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.lms.model.CourseTypeLearningActivity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courseTypeLearningActivityId</column-name><column-value><![CDATA[");
		sb.append(getCourseTypeLearningActivityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseTypeId</column-name><column-value><![CDATA[");
		sb.append(getCourseTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>learningActivityTypeId</column-name><column-value><![CDATA[");
		sb.append(getLearningActivityTypeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CourseTypeLearningActivity.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			CourseTypeLearningActivity.class
		};
	private long _courseTypeLearningActivityId;
	private long _originalCourseTypeLearningActivityId;
	private boolean _setOriginalCourseTypeLearningActivityId;
	private long _courseTypeId;
	private long _originalCourseTypeId;
	private boolean _setOriginalCourseTypeId;
	private long _learningActivityTypeId;
	private long _columnBitmask;
	private CourseTypeLearningActivity _escapedModelProxy;
}