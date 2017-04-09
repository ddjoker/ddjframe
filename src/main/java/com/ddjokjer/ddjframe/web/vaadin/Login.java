package com.ddjokjer.ddjframe.web.vaadin;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Link;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.LoginForm.LoginListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

/**
 * Created by dong on 2017/4/9.
 */
@SpringUI( path = "login")
public class Login extends UI {

  @Override
  protected void init(VaadinRequest vaadinRequest) {
   LoginForm loginForm =  new LoginForm();
   loginForm.addLoginListener(new LoginListener() {
      @Override
      public void onLogin(LoginEvent event) {
      }
    });
    setContent(loginForm);
  }
}
