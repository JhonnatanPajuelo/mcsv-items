package com.jpajuelo.mcsvitems.services;


import com.jpajuelo.mcsvitems.models.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems();
    List<Item> getProductsMayoresA(Double price);
}
