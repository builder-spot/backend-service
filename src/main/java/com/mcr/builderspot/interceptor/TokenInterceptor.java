package com.mcr.builderspot.interceptor;

import com.mcr.builderspot.dao.UserDao;
import com.mcr.builderspot.dao.UserTokenDao;
import com.mcr.builderspot.entities.User;
import com.mcr.builderspot.entities.UserToken;
import com.mcr.builderspot.enums.TokenStatus;
import com.mcr.builderspot.utils.Utils;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

  private final UserDao userDao;
  private final UserTokenDao userTokenDao;
  private final Utils utils;

  public TokenInterceptor(UserDao userDao, UserTokenDao userTokenDao, Utils utils) {
    this.userDao = userDao;
    this.userTokenDao = userTokenDao;
    this.utils = utils;
  }

  @Override
  public boolean preHandle (
      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    String token = utils.resolveToken(request);

    if (token == null) {
      log.error("Missing or Invalid Authorization header for request {}", request);
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      return false;
    }


    UserToken userToken = userTokenDao.findByTokenAndStatus(token, TokenStatus.ACTIVE);

    if (userToken == null) {
      log.info("Unauthorized header for request {}", request);
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      return false;
    }
    Optional<User> user = userDao.findById(userToken.getUserId());
    if(user.isEmpty()) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      log.warn("User not found");
      return false;
    }
    request.setAttribute("user", user.get());
    return true;
  }
}
