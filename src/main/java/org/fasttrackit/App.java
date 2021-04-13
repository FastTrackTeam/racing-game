package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
       Car carReference =  new Car();
       carReference.name = "Ferrari";
       carReference.maxSpeed = 300;
       carReference.fuelLevel = 60;
       carReference.mileage = 12.5;
       carReference.totalTravelDistance = 0;
       carReference.damaged = true;
       carReference.doorCount = 1;
       carReference.color = "Red";

        System.out.println("Properties of car " + carReference.name);
        System.out.println("Max speed " + carReference.maxSpeed);
        System.out.println("Fuel level " + carReference.fuelLevel);
        System.out.println("Mileage" + carReference.mileage);
        System.out.println("Total Travel Distance " + carReference.totalTravelDistance);
        System.out.println("Damaged " + carReference.damaged );
        System.out.println("Door Count " + carReference.doorCount);
        System.out.println("Color" + carReference.color );

        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTravelDistance = 190;
        car2.mileage = 59;


        System.out.println("Properties of car " + car2.name);
        System.out.println("Fuel level " + car2.fuelLevel);
        System.out.println("Mileage" + car2.mileage);
        System.out.println("Total Travel Distance " + car2.totalTravelDistance);
        System.out.println("Door Count " + car2.doorCount);
        System.out.println("Color" + car2.color );

        System.out.println("Initial name for car1 " + carReference.name);

        carReference.name = "Audi";
        System.out.println("Change name for car1 " + carReference.name);

        carReference = new Car();

        System.out.println("Name of new car " + carReference.name);

        carReference.name = "BMW";

        carReference= car2;
        System.out.println("Name of car referenced from 2 variables " +carReference.name);
        System.out.println("Name of car referenced from 2 variables "+car2.name);

        car2.name = "Dacia";

        System.out.println("Update of car referenced from 2 variables " +carReference.name);
        System.out.println("Update  of car referenced from 2 variables "+car2.name);


        car2 = null;

        System.out.println(carReference.name);




    }
}
