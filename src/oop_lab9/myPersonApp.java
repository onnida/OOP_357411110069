package oop_lab9;

public class myPersonApp {
    public static void main(String[] args) {

        //Address
        Address address = new Address("123","Nakhon si Thammarat",80110);

        //Job
       Job job = new Job("Docter",35000);

        //Person
        Person person = new Person("12","onnida",address,job);
        System.out.println(person.toString());

    }//main
}//class
