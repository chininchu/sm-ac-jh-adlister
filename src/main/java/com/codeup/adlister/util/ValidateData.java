package com.codeup.adlister.util;

import com.codeup.adlister.models.User;

public class ValidateData {


    public static boolean passwordPolicy(String password) {


        if ((password.length() < 8) || (password.length() > 16)) {
            return false;
        }

        // Password should contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Password should contain at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Password should contain at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Password should contain at least one special character
        if (!password.matches(".*[!@#$%^&*()-+=|{}[].,<>/?].*")) {
            return false;
        }

        // All checks passed, password is valid
        return true;
    }



}



