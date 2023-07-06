package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        if (str != null && str.length() > 0 && str.charAt(0) == '0')
            return false;
        return NumberUtils.toInt(str) > 0 || NumberUtils.toDouble(str) > 0;
    }
}