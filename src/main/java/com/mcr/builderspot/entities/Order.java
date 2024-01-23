package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "order")
@Data
@Entity
public class Order extends LongIdBaseEntity{
    @Column(name="product_id")
    private Long productId;

    @Column(name="user_id")
    private Long userId;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="payment_id")
    private Long paymentId;

    @Column(name="address_id")
    private Long addressId;

    @Column(name="status")
    private String status;
}
