package oop_lab7;
//super car
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5.country of origin

public class Supercar {
    private String carBrand;
    private String carColor;
    private String engSize;

    public Supercar (){}
    public Supercar (String b,String c,String e){
        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
    }

    public String getSupercarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                '}';
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}