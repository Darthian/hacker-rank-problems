package service;

import java.util.Map;
import java.util.TreeMap;

public class EbayChallengeService {

    public static String sortString(String str) {
        char[] letters = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (char letter : letters) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
