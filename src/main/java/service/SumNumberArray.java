package service;

import java.util.*;

public class SumNumberArray {

    public static List<Integer> twoSum(List<Integer> numbers, int target) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> evaluation = new HashSet<>();
        for(int i = 0; i< numbers.size(); i++) {
            if(evaluation.contains(numbers.get(i))) {
                result.add(numbers.indexOf(target - numbers.get(i)));
                result.add(numbers.lastIndexOf(numbers.get(i)));
            } else {
                evaluation.add(target - numbers.get(i));
            }
        }
        return result;
    }
}
