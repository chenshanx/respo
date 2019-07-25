package com.sn.repository.utils.annotation;

import java.lang.annotation.*;
/**
 * 注解，用于bean属性拷贝
 *
 * @author chenshanxi
 *
 * @date 2019年07月25日
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldCopy {
    /*原字段名*/
    String source();
    /*最大长度*/
    int maxLenth() default -1;
}
