package com.ddjokjer.ddjframe.biz.impl;

import com.ddjokjer.ddjframe.biz.UserService;
import com.ddjokjer.ddjframe.dao.UserMapper;
import com.ddjokjer.ddjframe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dong on 2017/3/7.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;
  @Override
  public User selectByPrimaryKey( Long id) {
    return userMapper.selectByPrimaryKey(id);
  }
}
