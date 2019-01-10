package com.totemtec.generator;

public class RandomCodeGegerator
{
    public static String getRandomCode()
    {
        return (int) (Math.random() * 900000 + 100000) + "";
    }

    public static void main(String[] args)
    {
        System.out.println(getRandomCode());
    }
}
