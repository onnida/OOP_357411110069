package oop_lab6;

public class StringCompare {
    public static void main(String[] args) {
     //   Compiler String
        String str1 = "Hello";
        String str2 = "Hellooo";
        //type 1 (==)
        if (str1==str2)System.out.println("true");
        else System.out.println("false");

        //type 2 (equals()method)
        if (str1.equals(str2))System.out.println("true");
        else System.out.println("false");
        //type 3(compareTO()method)
        // -,+,0
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str 2 more than 1");
        else
            System.out.println("str1 less than str2");



    }//main
}//class
