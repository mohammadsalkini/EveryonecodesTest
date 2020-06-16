package academy.everyonecodes.java.evaluation2.exercise3;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 16:01
 */
public class Spaceship {

    private String healthPointCounter;
    private String amountOfDamage;

    public Spaceship(String healthPointCounter, String amountOfDamage) {
        this.healthPointCounter = healthPointCounter;
        this.amountOfDamage = amountOfDamage;
    }

    public String getHealthPointCounter() {
        return healthPointCounter;
    }

    public void setHealthPointCounter(String healthPointCounter) {
        this.healthPointCounter = healthPointCounter;
    }

    public String getAmountOfDamage() {
        return amountOfDamage;
    }

    public void setAmountOfDamage(String amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }




}
