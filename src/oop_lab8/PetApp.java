package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bangkeaw",2,"Chayen");
        System.out.print(dog.toString());
        dog.makeNoise();
        dog.myPet();

        cat cat = new cat ("Giant",2,"persian");
        System.out.print(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();

    }//main
}//class
