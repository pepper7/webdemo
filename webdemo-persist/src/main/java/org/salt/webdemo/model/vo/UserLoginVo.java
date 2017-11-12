package org.salt.webdemo.model.vo;


import org.salt.webdemo.model.UserLogin;

/**
 * Created by pepper on 2017/10/31.
 */
public class UserLoginVo extends UserLogin {

    private String createdUserName;
    private String updatedUserName;

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public String getUpdatedUserName() {
        return updatedUserName;
    }

    public void setUpdatedUserName(String updatedUserName) {
        this.updatedUserName = updatedUserName;
    }
}
