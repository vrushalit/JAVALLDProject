package FactoryPattern;

import java.util.HashMap;
import java.util.function.Supplier;

public class VehicleFactory {
    private static final HashMap<String, Supplier<Vehicle>> registry = new HashMap<>();

    public static void registerVehicle(String name, Supplier<Vehicle> supplier){
        registry.put(name,supplier);
    }

    public static Vehicle createVehicle(String type){
        Supplier<Vehicle> supplier = registry.get(type);
        if(supplier != null){
            return supplier.get();
        }

        throw new IllegalArgumentException("No such vehicle registered.");
    }
}
