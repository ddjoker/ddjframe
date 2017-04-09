package com.ddjokjer.ddjframe.web.vaadin;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServletResponse;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringUI
@SuppressWarnings("serial")
public class Home extends UI {

  private Logger logger = LoggerFactory.getLogger(Home.class);

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    setContent(new Button("Click me", e -> {
      Page.getCurrent().open("/login","_self");
    }));
  }


}
