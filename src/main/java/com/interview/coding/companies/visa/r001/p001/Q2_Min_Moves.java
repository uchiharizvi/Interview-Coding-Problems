package com.interview.coding.companies.visa.r001.p001;

public class Q2_Min_Moves {
    public static void main(String[] args) {
        int[] a = new int[]{123, 543};
        int[] b = new int[]{321, 279};
        int moves = countMoves(a, b);
        System.out.println("Total moves to equal arrays: " + moves);
    }

    private static int countMoves(int[] a, int[] b) {
        int aLen = a.length;
        int counter = 0;
        if (a.length != b.length) {
            throw new RuntimeException("Make sure both arrays have equal elements");
        }
        for (int i = 0; i < aLen; i++) {
            String strA = String.valueOf(a[i]);
            String strB = String.valueOf(b[i]);
            for(int c=0;c<strA.length();c++){
                int intA = Integer.parseInt(Character.toString(strA.charAt(c)));
                int intB = Integer.parseInt(Character.toString(strB.charAt(c)));
                if(intA>intB) counter+=intA-intB;
                else counter+= intB-intA;
            }
        }
        return counter;
    }
}
