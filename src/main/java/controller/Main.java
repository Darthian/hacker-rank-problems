package controller;

public class Main {
    public static void main(String[] array) {
        if(array!= null && array.length>0 && array[0].length() > 0) {
            System.out.println(solveProblem(array));
        } else {
            System.out.println("");
        }
    }

    public static String solveProblem(String[] array) {
        StringBuilder prefix = new StringBuilder();
        //prefix.append(array[0].charAt(0));
        return evaluatePrefix(array, prefix, 0, 0);
    }

    /*input: [
            [qwerty],
            [qwg],
            [qwe]
            ]*/
    public static String evaluatePrefix(String[] array, StringBuilder prefix, Integer index, Integer kIndex) {
        System.out.println(prefix);

        if(index == 0) {
            prefix.append(array[index].charAt(kIndex));
        }

        if (prefix.toString().charAt(kIndex) != (array[index].charAt(kIndex))) {
            prefix.deleteCharAt(prefix.length()-1);
            return prefix.toString();
        }

        if (index + 1 == array.length) {
            return evaluatePrefix(array, prefix, 0, ++kIndex);
        } else {
            return evaluatePrefix(array, prefix, ++index, kIndex);
        }
    }
}
