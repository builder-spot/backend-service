package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "cart")
@Data
@Entity
public class Cart extends LongIdBaseEntity{
    @Column(name="user_id")
    private Long userId;

    @Column(name="product_id")
    private Long productId;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="price")
    private BigDecimal price;
}
