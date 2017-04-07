package com.ddjokjer.ddjframe.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
@ConditionalOnClass({ EnableTransactionManagement.class })
@AutoConfigureAfter({ DruidConfig.class })
@MapperScan({"com.ddjokjer.ddjframe.dao"})
public class MybatisConfig implements TransactionManagementConfigurer,EnvironmentAware {

  /**  //DataSource配置 另一种
   @Bean
   @ConfigurationProperties(prefix="spring.datasource")
   表示从spring配置中获取
   public DataSource dataSource() {
   return new org.apache.tomcat.jdbc.pool.DataSource();
   }*/
  @Autowired
  private DataSource dataSource;

  /**
   *创建sqlSessionFactoryBean 实例
   * 并且设置configtion 如驼峰命名.等等
   * 设置mapper 映射路径
   * 设置datasource数据源
   * @return
   * @throws Exception
   */
  @Bean(name = "sqlSessionFactory")
  public SqlSessionFactoryBean createSqlSessionFactoryBean() throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
/** 设置mybatis configuration 扫描路径 */
    sqlSessionFactoryBean
        .setConfigLocation(new DefaultResourceLoader()
            .getResource(propertyResolver
                .getProperty("configLocation")));
/** 设置datasource */
    sqlSessionFactoryBean.setDataSource(dataSource);
/** 设置typeAlias 包扫描路径 */
    sqlSessionFactoryBean.setTypeAliasesPackage(propertyResolver
        .getProperty("typeAliasesPackage"));

    sqlSessionFactoryBean
        .setMapperLocations(new PathMatchingResourcePatternResolver()
            .getResources(propertyResolver
                .getProperty("mapperLocations")));

    return sqlSessionFactoryBean;
  }

  @Bean
  public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

  @Bean
  @Override
  public PlatformTransactionManager annotationDrivenTransactionManager() {
    return new DataSourceTransactionManager(dataSource);
  }
  private RelaxedPropertyResolver propertyResolver;

  @Override
  public void setEnvironment(Environment environment) {
    this.propertyResolver = new RelaxedPropertyResolver(environment,
        "mybatis.");
  }
}