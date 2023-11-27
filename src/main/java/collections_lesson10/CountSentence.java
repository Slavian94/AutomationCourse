package collections_lesson10;
import java.util.HashMap;
import java.util.Map;

public class CountSentence {

    public static void main(String[] args) {

        char[] charArray = args[0].toCharArray();

        System.out.println("Кількість кожної літери у реченні:");

        Map<Character, Integer> letterCounter = countLetters(charArray);

        for (Map.Entry<Character, Integer> entry : letterCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    private static Map<Character, Integer> countLetters(char[] charArray) {
        Map<Character, Integer> letterCounter = new HashMap<>();

        for (Character letter : charArray) {

            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                letterCounter.put(letter, letterCounter.getOrDefault(letter, 0) + 1);
            }
        }

        return letterCounter;
    }
}
