package academy.everyonecodes.java.evaluation2.exercise2;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 15:49
 */
public class Antenna3G implements RadioAntenna{

    private final Integer frequency = 1900;

    @Override
    public Integer getFrequencies() {
        return frequency;
    }
}
