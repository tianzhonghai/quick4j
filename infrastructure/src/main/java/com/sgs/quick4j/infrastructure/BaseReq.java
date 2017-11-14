package com.sgs.quick4j.infrastructure;

import com.sgs.quick4j.infrastructure.exception.BizException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Tim_Tian ON 2017/10/13 15:14
 */
public abstract class BaseReq implements Serializable {
    private static final long serialVersionUID = -235822080790001901L;
    private static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    public void doValidate(){
        Set<ConstraintViolation<Object>> constraintViolations = VALIDATOR.validate(this);

        if(constraintViolations != null && constraintViolations.size() > 0){
            StringBuffer sb = new StringBuffer();
            for (ConstraintViolation item:constraintViolations) {
                sb.append(item.getMessage()).append(";");
            }

            //throw new IllegalArgumentException(sb.toString());
            BizException.throwIllegalArgument(sb.toString());
        }
    }
}
