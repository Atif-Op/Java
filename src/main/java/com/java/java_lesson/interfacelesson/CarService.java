package com.java.java_lesson.interfacelesson;

public class CarService {


    public static void main(String args[]){
        Car car []={new Bmw(),new Audi(),new Ferrari()};
        for(Car c:car){
    c.drive();
    c.assest();
}
    }
}
