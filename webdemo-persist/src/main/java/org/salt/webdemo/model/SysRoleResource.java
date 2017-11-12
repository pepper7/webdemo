package org.salt.webdemo.model;

import org.salt.common.model.CommonEntity;

public class SysRoleResource extends CommonEntity {
    private Integer roleId;

    private Integer resourceId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

}