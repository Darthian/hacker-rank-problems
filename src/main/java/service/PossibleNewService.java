package service;

import java.util.*;
import java.util.stream.Collectors;

public class PossibleNewService {
    /*
    * Context
    * int[] arr = {2, 3, -8, 7, -1, 2, 3};

        Output: Max Sum: 11
        Subarray: [7, -1, 2, 3]
        *
        * Input: int[] arr = {5, 4, 1, 7, 8};

            Output:
            Max Sum: 25
            Subarray: [5, 4, 1, 7, 8]
            *
            * [1, 4, 1, 7, -8]
        *
        *2+3+ ... = 8 -> 2, 3, -8, 7, -1, 2, 3
        *3+ -8 +... = 6 -> 2, 3, -8, 7, -1, 2, 3
        * -8 + 7 +... = 3 -> 2, 3, -8, 7, -1, 2, 3
        * 7 + ...3 = 11 -> 7, -1, 2, 3
        *
        * 5+ 4+ 1+ 7+ 8 = 25 -> 5, 4, 1, 7, 8
        * 4 + 1 + 7+ 8 = 20 -> 5, 4, 1, 7, 8
        * 1+ 7+ 8 = 16 -> 5, 4, 1, 7, 8
        *
        * Map = 25, <5, 4, 1, 7, 8>

        * allResult = 8
        * expected = 11
        *
        *
        *
    *
    *
    * */
    public static Integer getAnswer(int[] plainArray) {
        /*
        * Add the code for the new problem
        * */
        int possibleSum = 0;
        int temporalSum;
        List<Integer> possibleSubArray= new ArrayList<>();
        List<Integer> temporalSubArray ;

        for(int i=0; i < plainArray.length; i++) {
            temporalSubArray = new ArrayList<>();
            temporalSubArray.add(plainArray[i]);
            temporalSum = plainArray[i];
            for(int j=i+1; j<plainArray.length ; j++) {
                temporalSum = temporalSum + plainArray[j];
                temporalSubArray.add(plainArray[j]);
            }

            if(temporalSum > possibleSum) {
                possibleSum = temporalSum;
                possibleSubArray = new ArrayList<>(temporalSubArray);
            }
        }
        possibleSubArray.stream().forEach(x->System.out.print(x+" "));
        System.out.println();
        return possibleSum;
    }

}
