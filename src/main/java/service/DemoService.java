package service;

import java.util.Map;
import java.util.TreeMap;

public class DemoService {
/*
* Algorithm Question: Find the First Non-Repeating Character in a String
Problem Statement:
Given a string, find the first character that does not repeat. If all characters repeat, return null.

Example Input and Output:

Input: "swiss"
*
*
* i,2  sss,3 w,1
*
*
Output: 'w'
Input: "level"
Output: 'v'
Input: "aabbcc"
Output: null
*
*
*
* */


    public static String getCharacter(String input) {
         Map<String, Integer> charactersTree = new TreeMap<>();
         int iterator = 0;
         for(int i=0; i < input.length(); i++) {
             charactersTree.put(String.valueOf(input.charAt(i)),
                     charactersTree.getOrDefault(String.valueOf(input.charAt(i)), 0) + ++iterator);
         }
         Integer auxiliar = 10000;
         String result ="";

         for(Map.Entry<String, Integer> i : charactersTree.entrySet()) {
             if(i.getValue() < auxiliar) {
                 auxiliar = i.getValue();
                 result = i.getKey();
             }
         }

         return result;
    }


}
