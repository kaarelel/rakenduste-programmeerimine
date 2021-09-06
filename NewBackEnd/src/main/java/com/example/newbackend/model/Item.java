package com.example.newbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component

public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private String category; //enum

    //generate, get-set
}
