package com.sn.repository.utils.bean;

import com.sn.repository.utils.annotation.FieldCopy;
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
    @FieldCopy(source = "name")
    public String name;
    @FieldCopy(source = "age")
    public int age;
}
