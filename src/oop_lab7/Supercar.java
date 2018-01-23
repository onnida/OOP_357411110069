package oop_lab7;
//super car
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5.country of origin

public class Supercar {
    private String brand;

    @Override
    public String toString() {
        return "Supercar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", max='" + max + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    private String color;
    private String size;
    private String max;
    private String origin;
    //constructor
    //Default constructor
    public Supercar (){}
    //create constructor by owner
    public Supercar (String b,String c,String s,String m,String o){
        //assign data to class properties
        this.brand = b;
        this.color =c;
        this.size = s;
        this.max = m;
        this.origin = o;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
