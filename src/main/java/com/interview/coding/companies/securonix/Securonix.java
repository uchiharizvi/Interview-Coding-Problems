package com.interview.coding.companies.securonix;

import java.util.ArrayList;
import java.util.List;

public class Securonix {
    static List<String> al;
    public static void main(String[] args) {
        al = new ArrayList<>();
        al.add("some string random");
        al.add("hello world random");
        al.add("quick brown fox, random jumped over");
        search("brown");




    }
    static void search(String search) {
        //loop
        //n add operation O(N)
        //avg size = s
        //O(N)
        //
        for(int i=0;i<al.size();i++){
            if(al.get(i).contains(search)){

            }
    }



        ////thread safe
        //int getBalance(String bank, User user){
        //
        //  WhichApi api;
        //
        //  if(bank.equals("sbi")){
        //    api = getApi("sbi");
        //  }
        //  if(bank.equals("kotak")){
        //    api = getApi("kotak");
        //  }
        //
        //  return api.getBalance(user);
        //}
    }
}//ti sbi and t2 kotak

////get string number which contains the word
//add("some string random")
//.search("random") -> [1]
//.add("hello world random")
//.search("random") [1,2]
//.add("quick brown fox, random jumped over")
//.search("brown") -> [3]
//.search("history") -> null

//StringBuilder a = "";
//a.add("random")
//a.search
//a.append("2nd string hello random")
//search
//iterate stringBuilder -- give impl iea,
// random + hello world random + brown
// [1,2][3]

//al[]
//


