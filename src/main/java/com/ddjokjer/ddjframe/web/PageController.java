package com.ddjokjer.ddjframe.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

  @RequestMapping({"/","/index"})
  String home(Model model) {
    model.addAttribute("title","some thing good !");
    return "index";
  }
  @RequestMapping({"/main"})
  String main(Model model) {
    model.addAttribute("title","some thing good !");
    return "main";
  }

/*  @Bean
  @Scope("prototype")
  public ThymeleafView indexView() {
    ThymeleafView view = new ThymeleafView("index"); // templateName = 'main'
    view.setStaticVariables(
        Collections.singletonMap("title", "The ACME Fruit Company"));
    return view;
  }*/

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