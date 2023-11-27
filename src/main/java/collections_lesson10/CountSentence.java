package collections_lesson10;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;

public class CountSentence {

    public static void main(String[] args) {

        char[] charArray = args[0].toCharArray();

        System.out.println("Кількість кожної літери у реченні:");

        Map<Character, Integer> letterCounter = countLetters(charArray);
        System.out.println(letterCounter);


    }

    private static Map<Character, Integer> countLetters(char[] charArray) {

        Map<Character, Integer> letterCounter = new HashMap<>();

        for (Character character : charArray) {

            if (Character.isLetter(character)) {
                character = Character.toLowerCase(character);
                Integer counter =  letterCounter.getOrDefault(character, 0);
                letterCounter.put(character, counter++);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return letterCounter;
    }
}
