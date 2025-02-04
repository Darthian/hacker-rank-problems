package service;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class TokenService {

    public static void generateToken(String str) {
        String[] tokens = str.trim().split("\\s+|[,!?._'@]+");
        if(tokens.length == 0 || (tokens.length == 1 && tokens[0].isEmpty())) {
            System.out.println("0");
        } else {
            System.out.println(tokens.length);
        }
        Arrays.stream(tokens).forEach(System.out::println);
        PatternSyntaxException e = new PatternSyntaxException("Invalid pattern", "Invalid pattern", 0);
    }
}
