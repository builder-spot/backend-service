package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "payment")
@Data
@Entity
public class Payment extends LongIdBaseEntity{
    @Column(name="order_id")
    private Long orderId;

    @Column(name="payment_timestamp")
    private LocalDateTime paymentTimestamp;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="payment_type")
    private String paymentType;

    @Column(name="payment_method")
    private String paymentMethod;

    @Column(name="status")
    private String status;

    @Column(name="transaction_id")
    private String transactionId;
}
