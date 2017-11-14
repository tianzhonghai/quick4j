package com.sgs.quick4j.infrastructure.utils;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.List;

/**
 * Created by Tim_Tian ON 2017/10/13 14:52
 */
public class DozerUtils {
    public static Mapper getDozerMapper() {
        DozerBeanMapper mapper =(DozerBeanMapper)SpringUtils.getBean("dozerBean");
//        Mapper mapper = null;
//        try {
//            mapper = dozerBeanMapperFactoryBean.getObject();
//        }catch (Exception ex){
//            throw new RuntimeException("获取dozerMapper异常",ex);
//        }
        return mapper;
    }

    public static <From,To> List<To> mapList(List<From> fromList, final Class<To> toClass){
        return Lists.transform(fromList, new Function<From, To>() {
            @Override
            public To apply(From from){
                return getDozerMapper().map(from,toClass);
            }
        });
    }

    public static <From,To> To mapItem(From from, final  Class<To> toClass) {
        return getDozerMapper().map(from,toClass);
    }
}
