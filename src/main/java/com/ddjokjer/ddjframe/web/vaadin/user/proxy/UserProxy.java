package com.ddjokjer.ddjframe.web.vaadin.user.proxy;

import com.ddjokjer.ddjframe.biz.UserService;
import com.ddjokjer.ddjframe.web.vaadin.user.model.UserViewModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dong on 2017/6/11.
 */
@Service
public class UserProxy {

  @Autowired
  UserService userService;


  public List<UserViewModel> getUserList(){

  }
}
