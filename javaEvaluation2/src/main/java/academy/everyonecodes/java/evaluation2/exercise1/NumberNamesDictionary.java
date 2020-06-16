package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 14:41
 */
public class NumberNamesDictionary {

    private final static HashMap<Integer, String> dictionary = new HashMap<>();

    static {
        dictionary.put(0, "zero");
        dictionary.put(1, "one");
        dictionary.put(2, "two");
        dictionary.put(3, "three");
        dictionary.put(4, "four");
        dictionary.put(5, "five");
        dictionary.put(6, "six");
        dictionary.put(7, "seven");
        dictionary.put(8, "eight");
        dictionary.put(9, "nine");
    }

    public static Optional<Integer> getNumber(String name) {

        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(name)) {
                return Optional.ofNullable(entry.getKey());
            }
        }
        return Optional.empty();
    }

    public static Optional<String> getName(int number) {

        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            if (entry.getKey() == number) {
                return Optional.ofNullable(entry.getValue());
            }
        }
        return Optional.empty();
    }

}
