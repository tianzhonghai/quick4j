package com.sgs.quick4j;

import org.assertj.core.api.StringAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by Administrator ON 2018/2/4 16:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
@SpringBootConfiguration
public class TestOptional {
    @Test
    public void jtest(){
        OrderHead orderHead = null;

        Optional<OrderHead> optional = Optional.ofNullable(orderHead);
        String prodName = optional.map(x -> x.getOrderItem()).map(x -> x.getProductName()).orElse("unknow");

        Assert.assertEquals(prodName,"unknow");
    }
}
