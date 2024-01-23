package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "seller")
@Data
@Entity
public class Seller extends LongIdBaseEntity{
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="address")
    private String address;
}
