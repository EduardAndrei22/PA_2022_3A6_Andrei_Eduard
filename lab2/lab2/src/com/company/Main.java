package com.company;

public class Main {
    public static void main(String args[]) {
        Event c1 = new Event("C1",100,8,10);
        System.out.println(c1);
        Event c2 = new Event("C2", 100, 10, 12);
        System.out.println(c2);
        Event l1 = new Event("L1", 30, 8, 10);
        System.out.println(l1);
        Event l2 = new Event("L2", 30, 8, 10);
        System.out.println(l2);
        Event l3 = new Event("L3", 30, 10, 12);
        System.out.println(l3);
        Room myRoom1= new Room("lab",401,30);
        System.out.println(myRoom1);
        Problem pb = new Problem(c1,myRoom1);
        System.out.println(pb);


    }
}
