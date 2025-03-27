package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public static void main(String[] args) {
        Product product = Product.builder()
                .name("Test Product")
                .description("Test Description")
                .price(BigDecimal.valueOf(99.99))
                .build();
        System.out.println(product);
    }
}