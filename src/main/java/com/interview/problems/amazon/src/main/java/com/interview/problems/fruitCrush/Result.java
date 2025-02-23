package com.interview.problems.fruitCrush;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static int getMinFruits(List<Integer> fruits) {
        Map<Integer, Integer> fruitsMap = new HashMap<>();
        for (int fruit : fruits) {
            fruitsMap.put(fruit, fruitsMap.getOrDefault(fruit, 0) + 1);
        }
        List<Integer> uniqueFruits = new ArrayList<>(fruitsMap.keySet());

        // Step 3: Try to remove elements in pairs
        while (uniqueFruits.size() > 1) {
            // Remove two different fruits
            int fruit1 = uniqueFruits.get(0);
            int fruit2 = uniqueFruits.get(1);

            fruitsMap.put(fruit1, fruitsMap.get(fruit1) - 1);
            fruitsMap.put(fruit2, fruitsMap.get(fruit2) - 1);

            // Remove fruit from list if its count becomes zero
            if (fruitsMap.get(fruit1) == 0) {
                uniqueFruits.remove(0);
            }
            if (fruitsMap.get(fruit2) == 0) {
                uniqueFruits.remove(0); // After first removal, second fruit is at index 0 now
            }
        }

        // Step 4: Return the count of remaining unpaired elements
        int remaining = 0;
        for (int count : fruitsMap.values()) {
            remaining += count; // Sum up leftover fruits
        }
        return remaining;
    }
}
