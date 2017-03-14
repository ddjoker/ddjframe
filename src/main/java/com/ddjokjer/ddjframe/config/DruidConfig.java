package com.ddjokjer.ddjframe.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

@Configuration
public class DruidConfig implements EnvironmentAware {
  private static final Log logger = LogFactory.getLog(DruidConfig.class);
  private RelaxedPropertyResolver propertyResolver;


  @Bean
  public ServletRegistrationBean druidServlet() {
    ServletRegistrationBean reg = new ServletRegistrationBean();
    reg.setServlet(new StatViewServlet());
    reg.addUrlMappings("/druid/*");
    reg.addInitParameter("loginUsername", "druid");
    reg.addInitParameter("loginPassword", "jiajian123456");
    return reg;
  }
  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
    filterRegistrationBean.addInitParameter("profileEnable", "true");
    filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
    filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
    return filterRegistrationBean;
  }

  /** properties config
   @Value("${spring.datasource.url}")
   private String dbUrl;

   @Value("${spring.datasource.username}")
   private String username;

   @Value("${spring.datasource.password}")
   private String password;

   @Value("${spring.datasource.driver-class-name}")
   private String driverClassName;

   @Value("${spring.datasource.initialSize}")
   private int initialSize;

   @Value("${spring.datasource.minIdle}")
   private int minIdle;

   @Value("${spring.datasource.maxActive}")
   private int maxActive;

   @Value("${spring.datasource.maxWait}")
   private int maxWait;

   @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
   private int timeBetweenEvictionRunsMillis;

   @Value("${spring.datasource.minEvictableIdleTimeMillis}")
   private int minEvictableIdleTimeMillis;

   @Value("${spring.datasource.validationQuery}")
   private String validationQuery;

   @Value("${spring.datasource.testWhileIdle}")
   private boolean testWhileIdle;

   @Value("${spring.datasource.testOnBorrow}")
   private boolean testOnBorrow;

   @Value("${spring.datasource.testOnReturn}")
   private boolean testOnReturn;

   @Value("${spring.datasource.poolPreparedStatements}")
   private boolean poolPreparedStatements;

   @Value("${spring.datasource.filters}")
   private String filters;*/
  @Bean
  @Primary
  public DataSource druidDataSource(){
    DruidDataSource datasource = new DruidDataSource();
    datasource.setUrl(propertyResolver.getProperty("url"));
    datasource.setUsername(propertyResolver.getProperty("username"));
    datasource.setPassword(propertyResolver.getProperty("password"));
    datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
    datasource.setInitialSize(propertyResolver.getProperty("initialSize",Integer.class,1));
    datasource.setMinIdle(propertyResolver.getProperty("minIdle",Integer.class,1));
    datasource.setMaxActive(propertyResolver.getProperty("maxActive",Integer.class,20));
    datasource.setMaxWait(propertyResolver.getProperty("maxWait",Long.class,60000l));
    datasource.setTimeBetweenEvictionRunsMillis(propertyResolver.getProperty("timeBetweenEvictionRunsMillis",Long.class,60000l));
    datasource.setMinEvictableIdleTimeMillis(propertyResolver.getProperty("minEvictableIdleTimeMillis",Long.class,300000l));
    datasource.setValidationQuery(propertyResolver.getProperty("validationQuery"));
    datasource.setTestWhileIdle(propertyResolver.getProperty("testWhileIdle",Boolean.class,true));
    datasource.setTestOnBorrow(propertyResolver.getProperty("testOnBorrow",Boolean.class,false));
    datasource.setTestOnReturn(propertyResolver.getProperty("testOnReturn",Boolean.class,false));
    datasource.setPoolPreparedStatements(propertyResolver.getProperty("poolPreparedStatements",Boolean.class,true));
    try {
      datasource.setFilters(propertyResolver.getProperty("filters","stat"));
    } catch (SQLException e) {
      logger.error("druid configuration initialization filter", e);
    }
    return datasource;
  }

  @Override
  public void setEnvironment(Environment environment) {
    this.propertyResolver = new RelaxedPropertyResolver(environment,
        "spring.datasource.");
  }
}