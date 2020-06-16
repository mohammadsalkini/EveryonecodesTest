package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 14:40
 */
public class NumberNameShifter {

    public static void shifter (List <String> names) {

        List<String> shiftNumbers = new ArrayList<>();

        for (String name : names) {
            Optional<Integer> shiftingNumber = NumberNamesDictionary.getNumber(name);
            if (shiftingNumber.isPresent()) {
                int number = shiftingNumber.get() + 1;
                Optional<String> shiftedName = NumberNamesDictionary.getName(number);
                shiftedName.ifPresent(shiftNumbers::add);
            }
        }
        System.out.println(shiftNumbers);
    }
}
