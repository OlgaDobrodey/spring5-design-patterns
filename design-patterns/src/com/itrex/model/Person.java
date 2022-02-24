package com.itrex.model;

import com.itrex.structural.fasad.Roles;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    private Roles role;
    private Boolean freeTime;
    private Integer age;

}
