package com.interview.problems.companies.capitalcom.test;

import java.util.*;

public class Test {
    public static int findCurrentQueueTop(List<String> operations) {
        // Initialize an empty queue
        Queue<Integer> queue = new LinkedList<>();

        // Process each operation
        for (String op : operations) {
            if (op.startsWith("ENQUEUE")) {
                // Extract the number to enqueue
                String[] parts = op.split(" ");
                int x = Integer.parseInt(parts[1]);
                queue.add(x);  // Add x to the queue
            } else if (op.equals("DEQUEUE")) {
                queue.poll();  // Remove the front element of the queue
            }
        }

        // The front element of the queue is the first element
        return queue.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> operations = new ArrayList<>();
        for (int i =0; i<n;i++) {
            operations.add(scanner.nextLine());
        }
        int result = findCurrentQueueTop(operations);
        System.out.println(result);

//        // Example 1
//        String[] operations1 = {"ENQUEUE 1", "ENQUEUE 2"};
//        System.out.println(findCurrentQueueTop(2, operations1));  // Output: 1
//
//        // Example 2
//        String[] operations2 = {"ENQUEUE 20", "DEQUEUE", "ENQUEUE 40", "ENQUEUE 80", "DEQUEUE"};
//        System.out.println(findCurrentQueueTop(5, operations2));  // Output: 80
    }
}
