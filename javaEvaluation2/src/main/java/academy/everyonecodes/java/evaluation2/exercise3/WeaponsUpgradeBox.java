package academy.everyonecodes.java.evaluation2.exercise3;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 16:11
 */
public class WeaponsUpgradeBox extends MysteryBoxes{


    public WeaponsUpgradeBox(String intensity) {
        super(intensity);
    }

    @Override
    public void apply(Spaceship spaceship) {
        spaceship.setAmountOfDamage(getIntensity());
    }

    @Override
    public String toString() {
        return "Weapons Upgrade | " + getIntensity() ;
    }
}
