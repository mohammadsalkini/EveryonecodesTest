package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.Collections;
import java.util.List;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 14:41
 */
public class NumberNameFinder {

    public static void find (List<String> numbers) {
        Collections.sort(numbers);
        String lastNumber = numbers.get(numbers.size() - 1);
        System.out.println(lastNumber);
    }
}
