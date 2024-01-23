package com.mcr.builderspot.dao;

import com.mcr.builderspot.entities.UserToken;
import com.mcr.builderspot.enums.TokenStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTokenDao extends JpaRepository<UserToken, Long> {

  UserToken findByTokenAndStatus(String token, TokenStatus status);
}
