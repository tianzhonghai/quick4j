package com.sgs.quick4j.test.infrastructure;

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
public class TestOptional {
    @Test
    public void jtest(){
        OrderHead orderHead = null;
        String defaultVal = "";
        Optional<OrderHead> optional = Optional.ofNullable(orderHead);
        String prodName = optional.map(x -> x.getOrderItem())
                .map(x -> x.getProductName())
                .orElse(defaultVal);

        Assert.assertEquals(prodName,defaultVal);
    }
}
