package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:20
 */
public class FirstVowelFinder {

    public static Optional<Character> find (String text) {

        text = text.toLowerCase();

        for (int index = 0; index < text.length(); index ++) {
            char ch = text.charAt(index);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return Optional.of(ch);
            }
        }
        return Optional.empty();
    }
}
