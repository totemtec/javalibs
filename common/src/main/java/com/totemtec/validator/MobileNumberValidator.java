package com.totemtec.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Ref: https://github.com/VincentSit/ChinaMobilePhoneNumberRegex
 */

public class MobileNumberValidator {
    public static boolean isMobileNumber(String string)
    {
        Pattern pattern = Pattern.compile("^1\\d{10}$");
        Matcher matcher = pattern.matcher(string);

        if (!matcher.matches())
        {
            return false;
        }

        String string3 = string.substring(0, 3);
        if (!prefixSet.contains(string3))
        {
            return false;
        }

        return true;
    }



    public static void main(String[] strings)
    {
        System.out.println(isMobileNumber("13811522352"));
    }


    private static final String[] prefixes = new String[] {
            //中国移动
            "134", "135", "136", "137", "138", "139", "150", "151", "152", "157", "158", "159", "178", "182", "183", "184", "187", "188", "198",
            //中国联通
            "130", "131", "132", "155", "156", "166", "175", "176", "185", "186",
            //中国电信
            "133", "134", "153", "173", "174", "177", "180", "181", "189", "191", "199",
    };

    private static final Set<String> prefixSet = new HashSet<String>(Arrays.asList(prefixes));
}
