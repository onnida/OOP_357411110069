package oop_lab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bangkaw",2,"Chayen");
        System.out.print(dog.toString());
        dog.makeNoise();

        cat cat = new cat ("Giat",2,"persian");
        System.out.print(cat.toString());
        cat.makeNoise();
    }//main
}//class
