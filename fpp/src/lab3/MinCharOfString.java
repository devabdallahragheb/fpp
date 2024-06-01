package lab3;

public class MinCharOfString {
    public static void main(String[] args) {
        System.out.println(findMinChar(""));
    }

    public static char findMinChar(String word) {
        if (word == null || word.isEmpty()) {
            return ' ';
        } else if (word.length() == 1) {
            return word.charAt(0);
        } else {
            return word.charAt(0) <= findMinChar(word.substring(1)) ? word.charAt(0) : findMinChar(word.substring(1));
        }
    }
}
