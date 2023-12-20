package com.interview.coding.companies.lululemon;

/**
 * WAP to print the prefix of given String. Improve the solution. Given Values catch,cat,scatch,god,dog,do
 */
public class Problem002 {
    public static void main(String[] args) {
        String[] words = {"catch","cat","scatch","god","dog","do"};
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+2;j++){
                if(words[i].startsWith(words[j])) {
                    System.out.println(words[j]);
                    break;
                }
            }
        }
    }
}
