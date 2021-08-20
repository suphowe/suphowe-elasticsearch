package com.soft.es.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 员工对象实体类
 * @author suphwoe
 */
@Data
@ToString
@NoArgsConstructor
public class Employee {

    private String id;

    private Long version;

    String firstName;

    String lastName;

    Integer age;

    String[] interests;

}
