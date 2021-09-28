package com.example.newbackend.controller;

import com.example.newbackend.model.Item;
import com.example.newbackend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("items")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @PostMapping("items") //mis liiki päring
    public String postItem(@RequestBody Item item) {
        itemService.saveItem(item);
        return "Ese edukalt lisatud: " + item.getName();
    }

}

//restart
//http://localhost:8080/items
//Postmapingule alati kaasa

