package academy.everyonecodes.java.evaluation1.exercise2;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:01
 */
public class PictureNameExtractor {

    public static String extract(String fileName) {

        return fileName.substring(8)
                .replace("Pic", "")
                .replace(".jpg", "")
                .toLowerCase()
                .replaceAll("-", " ");
    }
}
