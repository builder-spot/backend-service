package com.mcr.builderspot.utils;

import com.mcr.builderspot.constant.Constants;
import java.security.SecureRandom;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;


@Component
public class Utils {


  public static String randomeUserToken() {
    return "31313";
  }

  public String resolveToken(HttpServletRequest req) {
    String bearerToken = req.getHeader(Constants.AUTHORIZATION_HEADER);
    if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
      return bearerToken.substring(7);
    }
    return null;
  }

  public static String generateRandomAlphanumericToken() {
    int tokenLength = 16;
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder token = new StringBuilder();

    SecureRandom random = new SecureRandom();

    for (int i = 0; i < tokenLength; i++) {
      int randomIndex = random.nextInt(characters.length());
      char randomChar = characters.charAt(randomIndex);
      token.append(randomChar);
    }

    return token.toString();
  }
}
