package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly r=new RWOnly();
        //r.name="sowmya" java: name has private access in com.driver.RWOnly
        System.out.println("java: name has private access in com.driver.RWOnly");
        r.setName("sowmya");
        System.out.println(r.getName());
    }
  
}