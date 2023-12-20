package com.interview.coding.companies.cisco.p001;

class Result {

    /*
     * Complete the 'getSumOfDoubleBasePalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER maximum as parameter.
     */

    public static int getSumOfDoubleBasePalindromes(int maximum) {
        for (int i = 1; i <= maximum; i++) {
            System.out.println(isPalindrome(Integer.toBinaryString(i)));

        }
        return 0;
    }

    public static boolean isPalindrome(String asciiValue) {
        int firstChar = 0,
                lastChar = asciiValue.length() - 1;
        boolean ch = true;
        for (int i = 0; i < asciiValue.length(); i++) {
            firstChar = firstPos(asciiValue, firstChar, lastChar);
            lastChar = lastPos(asciiValue, lastChar, firstChar);

            if (lastChar < 0 || firstChar < 0)
                break;
            if (asciiValue.charAt(firstChar) == asciiValue.charAt(lastChar)) {
                firstChar++;
                lastChar--;
                continue;
            }
            ch = false;
            break;
        }
        return ch;
    }

    static int firstPos(String str,
                        int start,
                        int end) {
        int firstChar = -1;

        // Get the position of
        // first character in
        // the string
        for (int i = start; i <= end; i++) {
            if (str.charAt(i) >= 'a' &&
                    str.charAt(i) <= 'z') {
                firstChar = i;
                break;
            }
        }

        return firstChar;
    }

    // Utility function to get
// the position of last
// character in the string
    static int lastPos(String str,
                       int start,
                       int end) {
        int lastChar = -1;

        // Get the position of last
        // character in the string
        for (int i = start; i >= end; i--) {
            if (str.charAt(i) >= 'a' &&
                    str.charAt(i) <= 'z') {
                lastChar = i;
                break;
            }
        }

        return lastChar;
    }
}