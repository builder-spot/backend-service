package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "user_address")
@Data
@Entity
public class UserAddress extends LongIdBaseEntity{
    @Column(name="user_id")
    private Long userId;

    @Column(name="address_name")
    private String addressName;

    @Column(name="full_name")
    private String fullName;

    @Column(name="phone")
    private String phone;

    @Column(name="flat_no")
    private String flatNo;

    @Column(name="street_address")
    private String streetAddress;

    @Column(name="landmark")
    private String landmark;

    @Column(name="pincode")
    private Long pincode;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    @Column(name="primary_address")
    private boolean primaryAddress;

}
