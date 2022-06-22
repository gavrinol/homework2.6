package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // зд 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i : nums) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //зд 2
        Set<Integer> task2 = new TreeSet<>();
        for (int i : nums) {
            if (i % 2 == 0) {
                task2.add(i);
            }
        }
        for (Integer i : task2){
            System.out.print(i + " ");
        }
        System.out.println();

        // зд 3
        List<String> task3 = List.of("test", "egrer", "test", "ygmkm", "test", "jnjn");
        System.out.print(new HashSet<>(task3));
        System.out.println();

        //зд 4
        List<String> task4 = List.of("test", "egrer", "test", "ygmkm", "test", "jnjn", "egrer");
        Map<String, Integer> result = new HashMap<>();
        for (String s : task4){
            if (result.containsKey(s)){
                result.put(s, result.get(s) + 1);
            }else {
                result.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " > " + entry.getValue());
        }
    }
}
