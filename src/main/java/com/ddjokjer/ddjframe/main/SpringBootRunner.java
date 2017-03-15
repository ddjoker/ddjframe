package com.ddjokjer.ddjframe.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dong on 2017/3/14.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.ddjokjer.ddjframe.biz"
    , "com.ddjokjer.ddjframe.dao"
    , "com.ddjokjer.ddjframe.web"
    , "com.ddjokjer.ddjframe.config"
    , "com.ddjokjer.ddjframe.api"})
public class SpringBootRunner {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringBootRunner.class, args);
  }
}
