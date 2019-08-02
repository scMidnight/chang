package com.chang.common.annotation;

import java.lang.annotation.*;

/**
 * @author: SunChang
 * @Date: 2019/8/2 11:09
 * @Description: 自定义注解防止表单重复提交
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {
}
