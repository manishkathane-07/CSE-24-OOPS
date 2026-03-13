/*
A ride booking application supports different types of rides. Each ride calculates
fare differently.
Question:
Create an abstract class Ride with:
1. distance
2. abstract method calculateFare()
Create subclasses:
1. BikeRide → fare = ₹5 per km
2. AutoRide → fare = ₹8 per km
3. CarRide → fare = ₹12 per km
Store different rides in a Ride array and calculate fares using runtime
polymorphism.
*/

abstract class Ride {
    int distance;

    Ride(int d) {
        distance = d;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(int d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

public class TestRide {
    public static void main(String[] args) {

        Ride rides[] = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println("Fare = " + r.calculateFare());
        }
    }
}