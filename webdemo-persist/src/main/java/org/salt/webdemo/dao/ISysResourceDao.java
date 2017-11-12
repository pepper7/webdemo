package org.salt.webdemo.dao;

import org.salt.webdemo.model.SysResource;

public interface ISysResourceDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysResource record);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysResource record);

    int updateByPrimaryKey(SysResource record);
}