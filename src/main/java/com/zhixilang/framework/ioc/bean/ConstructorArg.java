package com.zhixilang.framework.ioc.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author yhui
 * @date 2018-10-16 11:01
 */
@Data
@ToString
public class ConstructorArg {

    private Integer index;

    private String ref;

    private String name;

    private Object value;
}
