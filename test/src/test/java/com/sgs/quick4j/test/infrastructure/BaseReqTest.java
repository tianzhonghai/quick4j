package com.sgs.quick4j.test.infrastructure;

import com.sgs.quick4j.infrastructure.BaseReq;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator ON 2018/1/5 13:28
 */
@SpringBootTest()
@RunWith(SpringRunner.class)
@SpringBootConfiguration
public class BaseReqTest {

    @Test
    public void doValidate(){
        TestReq testReq = new TestReq();
        testReq.setAccount("");
        try {
            testReq.doValidate();
        }catch (Exception ex) {
            String msg = ex.getMessage();
        }
    }

    @Getter
    @Setter
    private class TestReq extends BaseReq {
        @NotBlank
        private String account;
    }
}
