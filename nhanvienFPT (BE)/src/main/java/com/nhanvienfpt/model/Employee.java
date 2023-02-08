package com.nhanvienfpt.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;
    private int age;
    private double salary;

    @ManyToOne
    private Branch branch;
}
