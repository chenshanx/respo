package com.sn.repository.utils.bean;

import com.github.dozermapper.core.Mapping;
import com.sn.repository.utils.annotation.FieldMapper;
import lombok.Data;

/**
 * 人
 *
 * @author Administrator
 *
 * @date 2019年07月25日
 */
@Data
public class People {

    @Mapping("sourceName")
    private String name;

    @Mapping("sourceAge")
    @FieldMapper(source = "sourceAge")
    private int age;
}
