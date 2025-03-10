package com.restassured.com.ex01_sampleCheck;

public class APItesting003_BuilderDesignPatterns {
    public APItesting003_BuilderDesignPatterns step1()
    {
        System.out.println("Step 1");
        return this;
    }
    public APItesting003_BuilderDesignPatterns step2()
    {
        System.out.println("Step 2");
        return this;
    }
    public APItesting003_BuilderDesignPatterns step3(String param1)
    {
        System.out.println("Step 3");
        return this;
    }
    public static void main(String[] args)
    {
        APItesting003_BuilderDesignPatterns bp=new APItesting003_BuilderDesignPatterns();
      bp.step1().step2().step3("hello");
    }
}


