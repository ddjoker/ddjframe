package com.ddjokjer.ddjframe.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by dong on 2017/3/14.
 */

@SpringBootApplication
@EnableTransactionManagement
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
