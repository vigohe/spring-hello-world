package com.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hello {
    private Number id;
    private String name;
    private String text;
}
