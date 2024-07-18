package org.example.questions.programs;

class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle is created");
    }
}

public class Bikes extends Vehicle {
    public Bikes() {

        super();
        System.out.println("Bike is created");
    }

    public static void main(String[] args) {
        Bikes b = new Bikes();
    }
}

/*
Explanation:
        super(); Call:
        The super(); call in the Bikes constructor explicitly invokes the constructor of the superclass Vehicle.
        This is actually redundant in this case because the compiler automatically inserts a call to the superclass constructor
        if no super(); or this(); call is specified.
        Constructor Chaining:
        In Java, when a subclass object is created, the constructor of the superclass is invoked first before the subclass
        constructor. This ensures that the initialization defined in the superclass is performed before the subclass
        initialization.*/
