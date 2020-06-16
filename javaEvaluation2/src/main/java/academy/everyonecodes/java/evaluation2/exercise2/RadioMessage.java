package academy.everyonecodes.java.evaluation2.exercise2;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 15:44
 */
public class RadioMessage {

    private String content;
    private Integer frequency;

    public RadioMessage(String content, Integer frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public Integer getFrequency() {
        return frequency;
    }
}
