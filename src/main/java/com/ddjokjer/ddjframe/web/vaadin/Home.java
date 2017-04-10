package com.ddjokjer.ddjframe.web.vaadin;

import com.ddjokjer.ddjframe.web.vaadin.view.LoginView;
import com.ddjokjer.ddjframe.web.vaadin.view.Mainview;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringUI(path = "")
@PreserveOnRefresh
@SuppressWarnings("serial")
public class Home extends UI {
  private Logger logger = LoggerFactory.getLogger(Home.class);

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    setNavigator(new Navigator(this,this));
    getNavigator().addView("",LoginView.class);
    getNavigator().addView("main",Mainview.class);
  }


}
