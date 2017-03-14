package com.ddjokjer.ddjframe.web;

import com.ddjokjer.ddjframe.biz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return userService.selectByPrimaryKey(1L).getUsername();
  }


/*  @RequestMapping("/user/{id}")
  @ResponseBody
  String user(@RequestParam("id") @NotNull Long id) {
    return userService.selectByPrimaryKey(id).getUsername();
  }*/

  @Autowired
  UserService userService;


}