package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String arg : args) {
            if (!isPositiveNumber(arg))
                return false;
        }
        return true;
    }
    }
