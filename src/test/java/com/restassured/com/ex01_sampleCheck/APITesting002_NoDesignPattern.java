package com.restassured.com.ex01_sampleCheck;

public class APITesting002_NoDesignPattern {
    public void step1()
    {
        System.out.println("Step 1");
    }
    public void step2()
    {
        System.out.println("Step 2");
    }
    public void step3(String param1)
    {
        System.out.println("Step 3");
    }
public static void main(String[] args)
{
    APITesting002_NoDesignPattern ap=new APITesting002_NoDesignPattern();
    ap.step1();
    ap.step2();
    ap.step3("Pooja");
}
}
