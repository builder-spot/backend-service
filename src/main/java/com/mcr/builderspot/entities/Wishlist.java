package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "wishlist")
@Data
@Entity
public class Wishlist extends LongIdBaseEntity{
    @Column(name="user_id")
    private Long userId;

    @Column(name="product_id")
    private Long productId;
}
