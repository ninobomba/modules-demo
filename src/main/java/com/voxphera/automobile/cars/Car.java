package com.voxphera.automobile.cars;

import com.voxphera.automobile.core.Engine;
import com.voxphera.automobile.parts.Chassis;

public class Car {

    public static void main( String[] args ) {

        new Chassis().build();
        new Engine().build();

        System.out.println("Running my car");

    }

}
