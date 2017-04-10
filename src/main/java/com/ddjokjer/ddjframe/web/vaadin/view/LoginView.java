package com.ddjokjer.ddjframe.web.vaadin.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.LoginForm.LoginListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SpringView
public class LoginView extends VerticalLayout implements View {
  public LoginView() {
    setSizeFull();

    LoginForm loginForm =  new LoginForm();
    loginForm.addLoginListener(new LoginListener() {
      @Override
      public void onLogin(LoginEvent event) {
        getUI().getNavigator().navigateTo("main");
      }
    });
    addComponent(loginForm);
    setComponentAlignment(loginForm, Alignment.MIDDLE_CENTER);
  }

  @Override
  public void enter(ViewChangeEvent event) {
    Notification.show("login page");
    getUI().getPage().setTitle("Login page");
  }
}