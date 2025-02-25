package com.jpajuelo.mcsvitems.services;

import com.jpajuelo.mcsvitems.clients.PruductFeignClient;
import com.jpajuelo.mcsvitems.models.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ItemServiceImpl implements ItemService {

    private PruductFeignClient productClient;

    public ItemServiceImpl(PruductFeignClient pruductClient) {
        this.productClient = pruductClient;
    }

    @Override
    public List<Item> getItems() {
        //return pruductClient.getAll().stream().map(product->new Item(product)).collect(Collectors.toList());
        return productClient.getAll().stream().map(Item::new).collect(Collectors.toList());
    }

    @Override
    public List<Item> getProductsMayoresA(Double price) {
        if(price==null){
            throw new RuntimeException("El precio es un valor nulo");
        }
        return productClient.getProductsMayoresA(price).getBody()
                .orElseThrow(()->new RuntimeException("Error al devolver el producto"))
                .stream().map(Item::new).collect(Collectors.toList());
    }
}
