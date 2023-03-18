package org.example;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") @Getter @Setter @NoArgsConstructor
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
