package org.salt.webdemo.dao;

import org.salt.webdemo.model.UserLogin;
import org.salt.webdemo.model.vo.UserLoginVo;

import java.util.List;
import java.util.Map;

public interface IUserLoginDao {
    int deleteByPrimaryKey(Long userId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);

    UserLogin selectByLoginName(String loginName);

    UserLogin selectByOpenId(String wxOpenId);

    List<UserLoginVo> selectVoByParams(Map<String, Object> params);
}