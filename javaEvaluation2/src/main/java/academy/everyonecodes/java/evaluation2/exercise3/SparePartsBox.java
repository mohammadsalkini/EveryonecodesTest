package academy.everyonecodes.java.evaluation2.exercise3;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 16:10
 */
public class SparePartsBox extends MysteryBoxes{


    public SparePartsBox(String intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        spaceship.setHealthPointCounter(getIntensity());
    }

    @Override
    public String toString() {
        return "Spare Parts | " + getIntensity() ;
    }
}
