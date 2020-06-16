package academy.everyonecodes.java.evaluation2.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 15:50
 */
public class RadioDevice{

    private static List<RadioAntenna> antennas = Arrays.asList(new Antenna3G(), new Antenna5G());

    public static Optional<String> receive (RadioMessage radioMessage) {

        for (RadioAntenna antenna : antennas) {
            if (radioMessage.getFrequency().equals(antenna.getFrequencies())) {
                return Optional.of(radioMessage.getContent());
            }
        }

        return Optional.empty();
    }




}
