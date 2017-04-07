package com.ddjokjer.ddjframe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.dialect.SpringStandardDialect;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

/**
 * Created by dong on 2017/3/26.
 * @see SpringStandardDialect
 * @see SpringTemplateEngine
 * @see ThymeleafProperties
 */
@Configuration
@AutoConfigureAfter({ ThymeleafProperties.class })
public class ThymeleafWebBean implements EnvironmentAware {

  private RelaxedPropertyResolver propertyResolver;

/*  @Autowired
  SpringTemplateEngine templateEngine;

  @Autowired
  ThymeleafProperties thymeleafProperties;*/

  @Override
  public void setEnvironment(Environment environment) {
    this.propertyResolver = new RelaxedPropertyResolver(environment,
        "spring.thymeleaf.");
  }

/*  @Bean
  public ThymeleafViewResolver viewResolver(){
    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
    viewResolver.setTemplateEngine(templateEngine);
    // NOTE 'order' and 'viewNames' are optional
    viewResolver.setOrder(thymeleafProperties.getTemplateResolverOrder());
    viewResolver.setViewNames(thymeleafProperties.getViewNames());
    return viewResolver;
  }*/

}
