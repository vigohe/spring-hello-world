package com.example.helloworld.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Person implements Serializable {

    @Id
    private Long id;

    private String fullName;

}