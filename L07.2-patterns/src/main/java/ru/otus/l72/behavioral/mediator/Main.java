package ru.otus.l72.behavioral.mediator;

/**
 * Created by tully.
 */
public class Main {
    public static void main(String[] args) {
        AirportControlMediator airportControlMediator = new AirportControlMediator();

        Aircraft aircraftA = new Plane("A", 0);
        Aircraft aircraftB = new Plane("B", 10);

        aircraftA.setControl(airportControlMediator);
        aircraftB.setControl(airportControlMediator);

        System.out.println(aircraftA);
        System.out.println(aircraftB);
        System.out.println();

        Aircraft aircraftC = new Plane("C", 20);
        aircraftC.setControl(airportControlMediator);


        System.out.println(aircraftA);
        System.out.println(aircraftB);
        System.out.println(aircraftC);
        System.out.println();

        aircraftA.moveTo(10);

        aircraftA.moveTo(30);

        System.out.println(aircraftA);
        System.out.println(aircraftB);
        System.out.println(aircraftC);
        System.out.println();

    }
}
