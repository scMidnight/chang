package com.chang.common.annotation;

import com.chang.common.enums.DataSourceTypeEnum;

import java.lang.annotation.*;

/**
 * @author: SunChang
 * @Date: 2019/8/2 11:06
 * @Description: 自定义多数据源切换注解
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    /**
     * 切换数据源名称
     */
    public DataSourceTypeEnum value() default DataSourceTypeEnum.MASTER;
}
