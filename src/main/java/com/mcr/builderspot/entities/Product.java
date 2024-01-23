package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "product")
@Data
@Entity
public class Product extends LongIdBaseEntity {
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="stock_quantity")
    private Long stockQuantity;
    @Column(name="category_id")
    private Long categoryId;
    @Column(name="brand_id")
    private Long brandId;
    @Column(name="image_url")
    private String imageUrl;
    @Column(name="seller_id")
    private Long sellerId;
}
