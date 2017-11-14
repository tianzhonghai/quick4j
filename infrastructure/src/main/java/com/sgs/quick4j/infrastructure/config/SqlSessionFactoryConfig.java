//package com.sgs.quick4j.infrastructure.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.sql.DataSource;
//
///**
// * Created by Tim_Tian ON 2017/10/13 14:21
// */
//@Configuration
//@EnableTransactionManagement
//@MapperScan("com.sgs.quick4j.domain.repository")
//public class SqlSessionFactoryConfig implements TransactionManagementConfigurer {
//
//    //mybatis 配置路径
//    private static String MYBATIS_CONFIG = "mybatis/mybatis-config.xml";
//
//    @Autowired
//    private DataSource dataSource;
//
//    private String typeAliasPackage = "com.sgs.quick4j.domain.repository";
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        /** 设置mybatis configuration 扫描路径 */
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
//        /** 设置datasource */
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        /** 设置typeAlias 包扫描路径 */
//        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
//        return sqlSessionFactoryBean;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
