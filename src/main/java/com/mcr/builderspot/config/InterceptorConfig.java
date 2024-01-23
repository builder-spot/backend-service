package com.mcr.builderspot.config;

import com.mcr.builderspot.interceptor.TokenInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

  private final TokenInterceptor tokenInterceptor;

  public InterceptorConfig(TokenInterceptor tokenInterceptor) {
    this.tokenInterceptor = tokenInterceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    registry.addInterceptor(tokenInterceptor)
        .excludePathPatterns(
            "/",
            "/api/v1/login/**"
        );

  }
}
