package academy.everyonecodes.java.evaluation1.exercise3;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:15
 */
public class VowelCounter {

    public static int count (String text) {

        text = text.toLowerCase();
        int count = 0;

        for (int index = 0; index < text.length(); index ++) {
            char ch = text.charAt(index);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++count;
            }
        }
        return count;
    }
}
