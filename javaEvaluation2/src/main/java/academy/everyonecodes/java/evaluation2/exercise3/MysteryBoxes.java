package academy.everyonecodes.java.evaluation2.exercise3;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 16:03
 */
public abstract class MysteryBoxes {

    private String intensity;

    public MysteryBoxes(String intensity) {
        this.intensity = intensity;
    }

    public abstract void apply(Spaceship spaceship);

    protected String getIntensity() {
        return intensity;
    }
}
