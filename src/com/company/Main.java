package com.company;

public class Main {

    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("Barsik");
    dog.setBreed("Alabai");
    dog.setCommands(new String[]{"sit", "lie down", "run"});
    dog.setColor(Color.BROWN);
    dog.setShelter(new Shelter("Shelter 1", "Ibraimova 1"));

    Dog dog1 = new Dog("Sosiska", "Taxa", Color.BLACK,new Shelter("Shelter 2","Jibek Jolu 33") );
    Dog dog2 = new Dog("Jessy","Haski",Color.GRAY,new Shelter("Shelter 3","Sovetskaya 144"), new String[]{"Heel","Stay","Down"});

        System.out.println(dog.getInfo());
        dog.makeVoice("RRRRR");
        System.out.println(dog1.getInfo());
        dog1.makeVoice("GAV",2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice(1,"GRR");

    }
}
