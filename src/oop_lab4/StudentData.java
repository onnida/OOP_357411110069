package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static String main(String[] args) throws IOException{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static string getName ()throw IOException{
             System.out.print("Enter your Name:");
             return reader.readLine();
    }//getName

    public static string getaddress ()throw IOException{
        System.out.print("Enter your address:");
        return reader.readLine();
    }//getaddress

    public static string getStdID ()throw IOException{
        System.out.print("Enter your ID:");
        return reader.readLine();
    }//getStdID

    public static string getFaculyt ()throw IOException{
        System.out.print("Enter your Faculyt:");
        return reader.readLine();
    }//getFaculyt

    public static string getEmail ()throw IOException{
        System.out.print("Enter your Email:");
        return reader.readLine();
    }//getEmail

        public static void main(String[]args)throw IOException{
             String Name = getName();
            String adderss = getaddress();
            String id = getStdID();
            String fac = getFaculyt();
            String email = getEmail();
            System.out.println(name+"\n"+adderss+"\n"+id"\n"+Fac);
    }
    }//main
}//class

