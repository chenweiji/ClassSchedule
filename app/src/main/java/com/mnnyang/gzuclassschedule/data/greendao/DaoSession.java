package com.mnnyang.gzuclassschedule.data.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.mnnyang.gzuclassschedule.data.beanv2.CourseV2;
import com.mnnyang.gzuclassschedule.data.beanv2.CourseGroup;

import com.mnnyang.gzuclassschedule.data.greendao.CourseV2Dao;
import com.mnnyang.gzuclassschedule.data.greendao.CourseGroupDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig courseV2DaoConfig;
    private final DaoConfig courseGroupDaoConfig;

    private final CourseV2Dao courseV2Dao;
    private final CourseGroupDao courseGroupDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        courseV2DaoConfig = daoConfigMap.get(CourseV2Dao.class).clone();
        courseV2DaoConfig.initIdentityScope(type);

        courseGroupDaoConfig = daoConfigMap.get(CourseGroupDao.class).clone();
        courseGroupDaoConfig.initIdentityScope(type);

        courseV2Dao = new CourseV2Dao(courseV2DaoConfig, this);
        courseGroupDao = new CourseGroupDao(courseGroupDaoConfig, this);

        registerDao(CourseV2.class, courseV2Dao);
        registerDao(CourseGroup.class, courseGroupDao);
    }
    
    public void clear() {
        courseV2DaoConfig.clearIdentityScope();
        courseGroupDaoConfig.clearIdentityScope();
    }

    public CourseV2Dao getCourseV2Dao() {
        return courseV2Dao;
    }

    public CourseGroupDao getCourseGroupDao() {
        return courseGroupDao;
    }

}
