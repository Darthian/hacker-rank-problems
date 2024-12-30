package service;

public class PrefixService {

    public static String evaluatePrefix(String[] array, StringBuilder prefix, Integer index, Integer kIndex) {
        if (array[index].isEmpty()) {
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
