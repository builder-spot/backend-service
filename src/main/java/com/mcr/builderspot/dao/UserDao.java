package com.mcr.builderspot.dao;

import com.mcr.builderspot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
