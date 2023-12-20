package com.interview.coding.companies.lululemon;

/**
 * WAP to print even/odd numbers using thread
 */
public class Problem001 {
    int counter = -1;
    static int n;

    public static void main(String[] args) {
        n = 10;
        Problem001 object = new Problem001();
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.printEvenNumber();
            }
        });
        // Create thread t1
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.printOddNumbers();
            }
        });
        //start both threads
        t1.start();
        t2.start();
    }

    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < n) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
                System.out.println(counter + " ");// Print the number
                counter++;// Increment counter
                notify();// Notify to 2nd thread
            }
        }
    }

    public void printOddNumbers() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }
}
