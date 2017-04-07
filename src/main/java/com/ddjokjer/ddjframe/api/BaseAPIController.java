package com.ddjokjer.ddjframe.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by dong on 2017/3/15.
 */
public class BaseAPIController {
    protected <T> HttpEntity<T> buildEntity(T t,HttpStatus status){
      return new ResponseEntity<T>(t, status);
    }
  protected <T> HttpEntity<T> buildEntity(T t){
    return buildEntity(t, HttpStatus.OK);
  }
}
