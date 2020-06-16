package academy.everyonecodes.java.evaluation2.exercise2;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 15:49
 */
public class Antenna5G implements RadioAntenna{

    private final Integer frequency = 4200;

    @Override
    public Integer getFrequencies() {
        return frequency;
    }
}
