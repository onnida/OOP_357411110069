package oop_lab8;

public abstract class Pet {
    String s;
    private String name;
    private int age;


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void myPet(){
        System.out.print(this.name);
    }
    //Abstract Method
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
