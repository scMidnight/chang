package com.chang.common.annotation;

import java.lang.annotation.*;

/**
 * @author: SunChang
 * @Date: 2019/8/2 11:05
 * @Description: 数据权限过滤注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {
    /**
     * 部门表的别名
     */
    public String deptAlias() default "";

    /**
     * 用户表的别名
     */
    public String userAlias() default "";
}
