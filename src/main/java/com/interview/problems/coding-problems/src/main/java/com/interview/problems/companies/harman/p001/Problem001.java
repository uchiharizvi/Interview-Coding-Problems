package com.interview.coding.companies.harman.p001;

import java.util.*;
import java.util.stream.Collectors;

public class Problem001 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        //sort map based on value
        hm.put("One", 80);
        hm.put("Two", 93);
        hm.put("Three", 80);
        hm.put("Four", 20);

        TreeMap<String, Integer> tm = hm.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue,
                 newValue)
                        -> newValue,
                TreeMap::new));
        System.out.println(tm);
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        System.out.println(hm);

        /*for(int i=0;i<map.size();i++){
           map.get(i).compareTo(map.get(i))
        }*/
        //[80.93,20]
        //
        //thread
        //print nos odd or even
        //T1 and T2
        //T1 T2
        //
        //table with emp,dept and sal
        //select dept, max(sal) from t1
        // order by sal asc
    }
}
