package com.interview.coding.practice.problems;

import java.util.*;

/**
 * Sort Hashmap based on key
 **/
public class Problem002 {
    public static void main(String[] args) {
        Map<String, List<String>> things = new HashMap<>();
        things.put("Fruits", getFruits());
        things.put("Vehicles", getVehicles());
        things.put("Ariel Vehicles", getAeros());
        things.put("Animals", getAnimals());
        sortKey(things);
        sortValue(things);
        for(Map.Entry<String, List<String>>entry:things.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private static List<String> getAnimals() {
        return Arrays.asList("Apple","Mango","Orange");
    }

    private static void sortValue(Map<String, List<String>> things) {
    }

    private static void sortKey(Map<String, List<String>> things) {

    }

    private static List<String> getAeros() {
        return Arrays.asList("Airbus","Jet Plane","Fighter Plane");
    }

    private static List<String> getVehicles() {
        return Arrays.asList("Car","Truck","Bus");
    }

    private static List<String> getFruits() {
       return Arrays.asList("Apple","Mango","Orange");
    }
}
