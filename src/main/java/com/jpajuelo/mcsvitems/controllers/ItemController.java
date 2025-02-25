package com.jpajuelo.mcsvitems.controllers;

import com.jpajuelo.mcsvitems.models.Item;
import com.jpajuelo.mcsvitems.services.ItemService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/items")
@RestController
public class ItemController {
    private ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    ResponseEntity<List<Item>> getAllItems(){
        return ResponseEntity.ok(itemService.getItems());
    }

    @GetMapping("/{price}")
    ResponseEntity<List<Item> > getAllProductsMayoresA(@PathVariable Double price){
        return ResponseEntity.ok(itemService.getProductsMayoresA(price));
    }

}
