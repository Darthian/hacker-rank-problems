package controller;

import java.util.Arrays;

public class Main {
    public static void main(String[] array) {
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(solveProblem(array));
    }

    public static String solveProblem(String[] array) {
        StringBuilder prefix = new StringBuilder();

        prefix.append(array[0].charAt(0));
        return evaluatePrefix(array, prefix, 0, 0);
    }

    /*input: [
            [q,w,e,r,t,y],
            [q,w,g],
            [q,w,e]
            ]*/
    public static String evaluatePrefix(String[] array, StringBuilder prefix, Integer index, Integer kIndex) {
        if (!prefix.toString().equals(array[index].charAt(kIndex))) {
            return prefix.toString();
        }
        index++;
        if (index == array.length - 1) {
            prefix.append(array[index].charAt(kIndex));
            return evaluatePrefix(array, prefix, 0, ++kIndex);
        } else {
            return evaluatePrefix(array, prefix, index, kIndex);
        }
    }
}
