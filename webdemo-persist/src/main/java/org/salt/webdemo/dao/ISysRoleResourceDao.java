package org.salt.webdemo.dao;

import org.apache.ibatis.annotations.Param;
import org.salt.webdemo.model.SysRoleResource;

public interface ISysRoleResourceDao {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("resourceId") Integer resourceId);

    int insert(SysRoleResource record);

    int insertSelective(SysRoleResource record);

    SysRoleResource selectByPrimaryKey(@Param("roleId") Integer roleId, @Param("resourceId") Integer resourceId);

    int updateByPrimaryKeySelective(SysRoleResource record);

    int updateByPrimaryKey(SysRoleResource record);
}