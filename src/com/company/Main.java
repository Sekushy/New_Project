package com.company;

public class Main {

    public static void main(String[] args) {
        Mug myMug = new Mug();
        myMug.setVolume(450);
        myMug.setColor("Maro");
        myMug.setDimension(10);
        myMug.setContent("Empty");
        myMug.setMaxVolume(500);

        System.out.println(myMug.getColor());
        System.out.println(myMug.getContent());
        System.out.println(myMug.getDimension());
        System.out.println(myMug.getVolume());

        myMug.setContent("Sprite");

        System.out.println(myMug.getColor());
        System.out.println(myMug.getContent());
        System.out.println(myMug.getDimension());
        System.out.println(myMug.getVolume());

        myMug.drink(50);
    }
}