package com.myjava.learning;

import com.myjava.javapack.CreateUserReq;
import com.myjava.util.ValidationUtil;

public class ReflectionApp {
    public static void reflectionMain(String[] args) {
        CreateUserReq req = new CreateUserReq();
        req.setUsername("daf");
        req.setPassword("vad");

        ValidationUtil.validationReflection(req);
    }
}
