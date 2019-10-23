package com.serverless.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TestTable {
    @Id
    private long id;

    private String firstName;
}
