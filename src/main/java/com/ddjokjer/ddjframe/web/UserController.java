package com.ddjokjer.ddjframe.web;

import com.ddjokjer.ddjframe.biz.UserService;
import com.ddjokjer.ddjframe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dong on 2017/3/15.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

  @RequestMapping("/{id}")
  public User view(@PathVariable("id") Long id) {
    return userService.selectByPrimaryKey(id);
  }

  @Autowired
  UserService userService;

}
