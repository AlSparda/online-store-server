package Sparda.online.store.controller;

import Sparda.online.store.domain.Catalog;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("ProductLineup")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductLineupController {

    private List<Product> getData(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1L, "Кеды"));
        list.add(new Product(2L, "Толстовка"));
        list.add(new Product(3L, "Брюки"));
        return list;
    }

    @GetMapping
    public List<Product> list(){
        return getData();
    }
}

