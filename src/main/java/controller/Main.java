package controller;

public class Main {
    public static void main(String[] array) {
        System.out.println(solveProblem(array));
    }

    public static String solveProblem(String[] array) {
        StringBuilder prefix = new StringBuilder();
        if (array != null && array.length > 0) {
            return evaluatePrefix(array, prefix, 0, 0);
        } else {
            return "";
        }
    }
    /*
    "asd", "asd"
     */
    public static String evaluatePrefix(String[] array, StringBuilder prefix, Integer index, Integer kIndex) {
        if (array[index].length() == 0) {
            return "";
        }
        if (kIndex >= array[index].length() ) {
            return prefix.toString();
        }
        if (index == 0) {
            prefix.append(array[index].charAt(kIndex));
        }
        if (prefix.toString().charAt(kIndex) != (array[index].charAt(kIndex))) {
            prefix.deleteCharAt(prefix.length() - 1);
            return prefix.toString();
        }
        if (index + 1 == array.length) {
            return evaluatePrefix(array, prefix, 0, ++kIndex);
        } else {
            return evaluatePrefix(array, prefix, ++index, kIndex);
        }
    }
}
