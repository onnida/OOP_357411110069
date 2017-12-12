package oop_lab3;

import jdk.nashorn.internal.ir.WhileNode;

public class TextWhileLoop {
    public static void main(String[] args) {
        //   while
        int i =1;
        while (i<=50) {
            System.out.print (i+" ");
            if (i%10==0)
                System.out.print ("Hello");
            i++;
        }//while




    }//main


}//class
