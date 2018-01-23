package oop_lab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        //create Ojbects as Supercar
        Supercar supercar1 = new Supercar();
        supercar1.setBrand("Yaris");
        supercar1.setColor("black");
        supercar1.setMax("2100");
        supercar1.setOrigin("220/c");
        supercar1.setSize("Educate");
        System.out.println( supercar1.toString());

        Supercar supercar2 = new Supercar();
        supercar2 = inputData(supercar2);
        System.out.println(supercar2.toString());


    }//main
    private static Supercar inputData(Supercar  s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student data: ");
        System.out.print("Brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("Color: ");
        s.setColor(scanner.nextLine());
        System.out.print("Max: ");
        s.setMax(scanner.nextLine());
        System.out.print("Origin: ");
        s.setOrigin(scanner.nextLine());
        System.out.print("Size: ");
        s.setSize(scanner.nextLine());

        return s;

    }
}//class
