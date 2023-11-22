package com.crackit.records.demo;

import java.io.Serializable;

public record Employee(Integer id, String name, int age) implements Serializable {

    public Employee {
        if(age < 18)
            throw new IllegalArgumentException("Age should be greater than 18");
    }

}
