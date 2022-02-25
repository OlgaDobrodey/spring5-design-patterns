package com.itrex.springbootmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private int id;
    private String name;
    private String address;
}
