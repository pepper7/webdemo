package org.salt.webdemo.dao;

import org.apache.ibatis.annotations.Param;
import org.salt.webdemo.model.SysUserRole;

public interface ISysUserRoleDao {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Integer roleId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Integer roleId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}