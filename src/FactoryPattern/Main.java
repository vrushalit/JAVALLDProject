package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory.registerVehicle("car",Car::new);
        VehicleFactory.registerVehicle("truck",Truck::new);

        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();

        VehicleFactory.registerVehicle("bike",Bike::new);

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive();

    }
}
