package Sparda.online.store.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Product implements Serializable {

    private Long id;

    private String name;
}
