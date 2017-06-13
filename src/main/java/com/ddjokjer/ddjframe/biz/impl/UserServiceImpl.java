package com.ddjokjer.ddjframe.biz.impl;

import com.ddjokjer.ddjframe.biz.UserService;
import com.ddjokjer.ddjframe.dao.user.UserMapper;
import com.ddjokjer.ddjframe.dao.user.UserPreferencesMapper;
import com.ddjokjer.ddjframe.dao.user.UserSettingsMapper;
import com.ddjokjer.ddjframe.dao.user.login.UserLoginDefaultMapper;
import com.ddjokjer.ddjframe.model.user.User;
import com.ddjokjer.ddjframe.model.user.login.UserLoginDefault;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dong on 2017/3/7.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;
  @Autowired
  UserPreferencesMapper userPreferencesMapper;
  @Autowired
  UserSettingsMapper userSettingsMapper;
  @Autowired
  UserLoginDefaultMapper userLoginDefaultMapper;

  @Override
  public User selectByPrimaryKey( String id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public User createUser(User user, UserLoginDefault userLoginDefault) {
    user.setUsrGuid(UUID.randomUUID().toString());
    userMapper.insert(user);

    return user;
  }

}
