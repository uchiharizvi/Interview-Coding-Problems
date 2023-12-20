package com.interview.coding.companies.amazon.p001;

public class LinkedListSum {
    public static int maxLinkedListSum(Node head) {
        if (head == null) return 0;
        if (head.next == null) return head.data;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node first = head;
        //Reverse List because you don't want to save this result in a variable as its O(1) space needed.
        Node prev = null;
        while (slow != null) {
            Node nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        int maxSum = Integer.MIN_VALUE;
        while (first != null && prev != null) {
            maxSum = Math.max(maxSum, first.data + prev.data);
            first = first.next;
            prev = prev.next;
        }
        return maxSum;
    }

    public static void print(Node node) {
        while (node != null && node.next != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }

        if (node != null) {
            System.out.println(node.data);
        } else {
            System.out.println("Empty LinkedList");
        }
    }

    public static Node stringToNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        Node dummyRoot = new Node(0);
        Node ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new Node(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
}
