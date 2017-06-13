package com.ddjokjer.ddjframe.web.vaadin.user;

import com.ddjokjer.ddjframe.web.vaadin.user.model.UserViewModel;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dong on 2017/6/11.
 */
public class UserGridPanel  extends HorizontalLayout implements View {


  @Override
  public void enter(ViewChangeEvent viewChangeEvent) {
    Grid<UserViewModel> grid = new Grid<>("User List");
    addComponent(grid);


  }
}
