package com.ddjokjer.ddjframe.web;

import com.ddjokjer.ddjframe.biz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController

public class PageController {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "wellcome to home page!";
  }

/*  @RequestMapping("/error/404")
  @ResponseBody
  String error404() {
    return "wellcome to 404 page!";
  }

  @RequestMapping("/error/500")
  @ResponseBody
  String error500() {
    return "wellcome to 500 page!";
  }

  @RequestMapping("/error")
  @ResponseBody
  String error() {
    return "wellcome to error page!";
  }*/
}