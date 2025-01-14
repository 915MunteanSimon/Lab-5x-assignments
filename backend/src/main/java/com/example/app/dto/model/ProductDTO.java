package com.example.app.dto.model;

import com.example.app.model.Manufacturer;
import com.example.app.model.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.sql.Date;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductDTO {
    @Getter
    @Setter
    private Integer id;
    @NotBlank
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Date publishDate;
    @Min(0)
    @Getter
    @Setter
    private Double price;
    @Min(0)
    @Getter
    @Setter
    private Integer weight;
    @Getter
    @Setter
    private Integer manufacturerId;
    @Getter
    @Setter
    private String color;

    public static ProductDTO fromProduct(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPublishDate(),
                product.getPrice(),
                product.getWeight(),
                product.getManufacturer().getId(),
                product.getColor()
        );
    }

    public static Product toProduct(ProductDTO productDTO, Manufacturer manufacturer) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPublishDate(productDTO.getPublishDate());
        product.setPrice(productDTO.getPrice());
        product.setWeight(productDTO.getWeight());
        product.setManufacturer(manufacturer);
        product.setColor(productDTO.getColor());
        return product;
    }



}

