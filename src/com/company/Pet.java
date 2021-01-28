package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        //return new Random().nextInt(18) + 1;
        return (int) (Math.random() * 10 + 5);
    }

    public  String getInfo() {
        return "_______________" + "\nAge: " + age + "\nColor: " + color + "\nShelter: " + "[" + shelter.getName() + "; " + shelter.getAddress()
                + "]";
    }
}
