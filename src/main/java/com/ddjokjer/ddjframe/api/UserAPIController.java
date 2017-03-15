package com.ddjokjer.ddjframe.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.ddjokjer.ddjframe.biz.UserService;
import com.ddjokjer.ddjframe.model.User;
import com.ddjokjer.ddjframe.model.api.APIEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dong on 2017/3/15.
 */
@RestController
@RequestMapping("/api/user")
public class UserAPIController extends BaseAPIController {

  @RequestMapping("/{id}")
  public HttpEntity<APIEntity<User>> getUser(@PathVariable("id") Long id) {
    return buildEntity(APIEntity.create(userService.selectByPrimaryKey(id))
        .addLinkOn(linkTo(methodOn(UserAPIController.class).getUser(id)).withSelfRel())
        , HttpStatus.OK);
  }

  @Autowired
  UserService userService;

}
