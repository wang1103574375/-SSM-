package com.demo.Utils;

import java.util.UUID;

public class CodeUtils {
    public static String generateUniqueCode(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
