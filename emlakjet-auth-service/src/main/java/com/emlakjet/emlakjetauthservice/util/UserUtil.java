package com.emlakjet.emlakjetauthservice.util;

public class UserUtil {

    private UserUtil() {
        //UtilityClass
    }

    public static boolean isValidPassword(String password, String password2) {
        return password.equals(password2);
    }

}
