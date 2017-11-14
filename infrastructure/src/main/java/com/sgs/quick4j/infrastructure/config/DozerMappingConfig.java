package com.sgs.quick4j.infrastructure.config;

import org.dozer.DozerBeanMapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tim_Tian ON 2017/10/13 14:27
 */
@Configuration
@ComponentScan(basePackages={"com.sgs.quick4j"})
public class DozerMappingConfig {
    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {
        List<String> mappingFiles = Arrays.asList(
                "dozer-global-configuration.xml",
                "dozer-bean-mappings.xml",
                "more-dozer-bean-mappings.xml"
        );

        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }

    @Bean(name = "dozerBean")
    public DozerBeanMapperFactoryBean configDozer() throws IOException {
        DozerBeanMapperFactoryBean mapper = new DozerBeanMapperFactoryBean();
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:dozer-bean-mappings.xml");
        mapper.setMappingFiles(resources);
        return mapper;
    }
}
