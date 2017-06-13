package com.ddjokjer.ddjframe.web.vaadin.user.model;

import com.ddjokjer.ddjframe.model.user.User;
import com.ddjokjer.ddjframe.model.user.UserPreferences;
import com.ddjokjer.ddjframe.model.user.UserSettings;
import com.ddjokjer.ddjframe.model.user.login.UserLoginDefault;

/**
 * Created by dong on 2017/6/11.
 */

public class UserViewModel {
  private User user;
  private UserLoginDefault userLoginDefault;
  private UserSettings settings;
  private UserPreferences userPreferences;

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserLoginDefault getUserLoginDefault() {
    return this.userLoginDefault;
  }

  public void setUserLoginDefault(UserLoginDefault userLoginDefault) {
    this.userLoginDefault = userLoginDefault;
  }

  public UserSettings getSettings() {
    return this.settings;
  }

  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }

  public UserPreferences getUserPreferences() {
    return this.userPreferences;
  }

  public void setUserPreferences(UserPreferences userPreferences) {
    this.userPreferences = userPreferences;
  }


}
