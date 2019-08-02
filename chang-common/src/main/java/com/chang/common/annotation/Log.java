package com.chang.common.annotation;

import com.chang.common.enums.BusinessTypeEnum;
import com.chang.common.enums.OperatorTypeEnum;

import java.lang.annotation.*;

/**
 * @author: SunChang
 * @Date: 2019/8/2 11:07
 * @Description: 自定义操作日志记录注解
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    public String title() default "";

    /**
     * 功能
     */
    public BusinessTypeEnum businessType() default BusinessTypeEnum.OTHER;

    /**
     * 操作人类别
     */
    public OperatorTypeEnum operatorType() default OperatorTypeEnum.MANAGE;

    /**
     * 是否保存请求的参数
     */
    public boolean isSaveRequestData() default true;
}
