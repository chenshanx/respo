package com.sn.repository.utils.bean;

import com.sn.repository.utils.annotation.FieldMapper;
import lombok.Data;

/**
 * 学生类
 *
 * @author chenshanxi
 * @date 2019年07月26日
 */
@Data
public class Student {
    @FieldMapper(source = "sourceName")
    private String sourceName;

    private int sourceAge;
}
