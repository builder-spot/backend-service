package com.mcr.builderspot.entities;

import com.mcr.builderspot.enums.TokenStatus;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "user_token")
@Data
@Entity
public class UserToken extends LongIdBaseEntity{
    @Column(name="user_id")
    private Long userId;

    @Column(name="token")
    private String token;

    @Column(name = "status")
    private TokenStatus status;
}
