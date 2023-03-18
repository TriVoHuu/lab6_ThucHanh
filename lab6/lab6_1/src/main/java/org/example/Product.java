package org.example;

import lombok.*;
@Getter @Setter @NoArgsConstructor
public class Product {
    private long id;
    private String name;
    private double price;
    private String description;

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.description = product.description;
    }
}
