package com.sgs.quick4j;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator ON 2018/2/4 16:47
 */
@Getter
@Setter
public class OrderHead {
    private String orderCode;

    private OrderItem orderItem;
}
