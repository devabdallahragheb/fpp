package homework2;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctWords(new String[]{"horse", null, "cat", "horse", "dog"})));
    }

    public static String[] distinctWords(String[] input) {
        String[] distinctWords = new String[input.length];
        int counter = 0;
        for (String s : input) {
            if(s == null) continue;
            boolean duplicate = false;
            for (int j = 0; j < counter; j++)
                if (distinctWords[j].equals(s)) {
                    duplicate = true;
                    break;
                }
            if (!duplicate) {
                distinctWords[counter] = s;
                counter++;
            }
        }

        String[] result = new String[counter];
        System.arraycopy(distinctWords, 0, result, 0, counter);

        return result;
    }
}