package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student
                ("069",
                "onnida",
                "Gril",
                22,
                "357411110069",
                "IS : Management Technology");
        System.out.print(student.toString());
        System.out.print(student.getName());
    }//main
}//class
