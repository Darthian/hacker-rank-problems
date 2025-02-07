package service;

import java.util.Arrays;
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
        Map<String, int[]> charactersTree = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            charactersTree.put(String.valueOf(input.charAt(i)),
                    new int[]{i, charactersTree.getOrDefault(String.valueOf(input.charAt(i)), new int[]{0, 0})[1] + 1});
        }
        int auxiliar = 100000;
        String result = "";
        //charactersTree.forEach((key, value) -> System.out.println(key + " " + Arrays.toString(value)));
        for (Map.Entry<String, int[]> characterNode : charactersTree.entrySet()) {
            if (characterNode.getValue()[0] < auxiliar) {
                auxiliar = characterNode.getValue()[0];
                result = characterNode.getKey();
            }
            if(characterNode.getValue()[1] > 1)
                result = "null";
        }
        return result;
    }


}
