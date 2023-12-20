package com.interview.coding.practice.problems;

public class LongestPalindromeLinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = newNode(4);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(2);
        head.next.next.next.next.next = newNode(15);
        System.out.println(maxPalindrome(head));
    }

    private static int maxPalindrome(Node head) {
        int result = 0;
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            result = Math.max(result, 2 * countCommon(prev, next) + 1);
            result = Math.max(result, 2 * countCommon(curr, next));
            prev = curr;
            curr = next;
        }
        return result;
    }

    private static int countCommon(Node a, Node b) {
        int count = 0;
        for (; a != null && b != null; a = a.next, b = b.next) {
            if (a.data == b.data) ++count;
            else break;
        }
        return count;
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
}

class Node {
    int data;
    Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
