package com.jpajuelo.mcsvitems.clients;

import com.jpajuelo.mcsvitems.models.responses.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "products", url = "localhost:8080/Products")
public interface PruductFeignClient {
    @GetMapping("/getAll")
    List<ProductResponse> getAll();

    @GetMapping("/ProductosMayoresA/{price}")
    ResponseEntity<Optional<List<ProductResponse>>> getProductsMayoresA(@PathVariable("price") Double price);
}
