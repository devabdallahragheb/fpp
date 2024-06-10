package lab6.prog2;

public class StringUtils {

    public static String count(String input){
        return String.valueOf(input.length());
    }

    public static String reverse(String input){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String removeDuplicates(String input){
        StringBuilder stringBuilder = new StringBuilder();
        input.chars().distinct().forEach(c -> stringBuilder.append((char) c));
        return stringBuilder.toString();
    }
}
