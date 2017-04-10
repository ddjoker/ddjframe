package com.ddjokjer.ddjframe.web.vaadin.view;

import com.ddjokjer.ddjframe.web.vaadin.Main;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Notification;

/**
 * Created by dong on 2017/4/10.
 */
@SpringView
public class Mainview extends Main implements View {
  public Mainview() {
    setSizeFull();
  }
  @Override
  public void enter(ViewChangeEvent event) {
    Notification.show("welcome ");
    getUI().getPage().setTitle("Welcome to Vaadin");
  }
}
