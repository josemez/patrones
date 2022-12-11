package org.example;

import org.example.patters.abstractFactory.RunFactory;
import org.example.patters.abstractFactory.factories.MacOSFactory;
import org.example.patters.builder.CarBuilder;
import org.example.patters.builder.cars.Car;
import org.example.patters.builder.director.Director;

public class Main {
    private static RunFactory factory = new RunFactory(new MacOSFactory());
    public static void main(String[] args) {

//        factory.paint();
//        System.out.println("Hello world!");

        // patron builder
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.print());


//        CarManualBuilder manualBuilder = new CarManualBuilder();
//
//        // Director may know several building recipes.
//        director.constructSportsCar(manualBuilder);
//        Manual carManual = manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual.print());


    }
}