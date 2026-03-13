/* 
Define a class CARRENTAL with the following details:
 Class Members are: CarId of int type, CarType of string type and Rent of
float type.
1. Define GetCar() method which accepts CarId and CarType.
2. GetRent() method which return rent of the car on the basis of car type, i.e.
Small Car = 1000, Van = 800, SUV = 2500
3. ShowCar() method which allow user to view the contents of cars i.e. id, type
and rent.
*/

import java.util.*;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else if (CarType.equals("SUV"))
            Rent = 2500;

        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(101, "SUV");
        c.GetRent();
        c.ShowCar();
    }
}