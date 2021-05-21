package com.company;

public class App {

    public static void main(String[] args) {

        Farmer bob = new Farmer("Bob");
        Warrior dave = new Warrior("Dave");
        Constable john = new Constable("John");


        System.out.println(bob);
        System.out.println(dave);
        System.out.println(john);

        bob.heal();
        dave.increaseStamina();
        john.decreaseHealth();




    }





}
