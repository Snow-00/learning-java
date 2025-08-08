package com.myjava.learning;

import com.myjava.error.ValidationException;
import com.myjava.javapack.LoginRequest;
import com.myjava.util.ValidationUtil;

public class ValidationApp {
    public static void validationMain(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", null);

        // try {
        //     ValidationUtil.validate(loginRequest);
        //     System.out.println("Data valid");
        // } catch (ValidationException exception) {
        //     System.out.println("Data tidak valid: " + exception.getMessage());
        // } catch (NullPointerException exception) {
        //     System.out.println("Data null: " + exception.getMessage());
        // }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid: " + e.getMessage());
        } finally {
            System.out.println("Finally finish");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukss");
    }
}
