package com.jpajuelo.mcsvitems.models;
import com.jpajuelo.mcsvitems.models.responses.ProductResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Item {
    private String caritaFeliz;
    private ProductResponse product;

    public Item(ProductResponse product) {
        this.caritaFeliz= ":)";
        this.product = product;
    }

}
