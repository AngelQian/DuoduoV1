package com.duoduo;

import java.util.UUID;

/**
 * Created by AngelQian on 5/23/16.
 */
public class Util {
    public static String convertUUIDtoString(UUID id){
        String expenseUUID = UUID.randomUUID().toString();
        expenseUUID = expenseUUID.replaceAll("-", "");
        return expenseUUID;
    }
}
