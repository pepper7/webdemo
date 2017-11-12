package org.salt.webdemo.model;

import org.salt.common.model.CommonEntity;

import java.util.Map;

public class UserLogin extends CommonEntity {
    private Long userId;
    private String loginName;
    private String password;
    private String salt;
    private String userName;
    private Byte enabled;
    private Byte locked;
    private String wxOpenId;
    private String wxImage;
    private String wxNickname;
    private String deptId;

    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("userId", userId);
        map.put("loginName", loginName);
        map.put("password", password);
        map.put("salt", salt);
        map.put("userName", userName);
        map.put("enabled", enabled);
        map.put("locked", locked);
        map.put("wxOpenId", wxOpenId);
        map.put("wxImage", wxImage);
        map.put("wxNickname", wxNickname);
        map.put("deptId", deptId);
        return map;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId == null ? null : wxOpenId.trim();
    }

    public String getWxImage() {
        return wxImage;
    }

    public void setWxImage(String wxImage) {
        this.wxImage = wxImage == null ? null : wxImage.trim();
    }

    public String getWxNickname() {
        return wxNickname;
    }

    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname == null ? null : wxNickname.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

}