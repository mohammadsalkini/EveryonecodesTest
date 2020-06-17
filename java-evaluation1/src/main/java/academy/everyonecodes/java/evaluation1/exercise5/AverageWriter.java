package academy.everyonecodes.java.evaluation1.exercise5;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 12:58
 */
public class AverageWriter {

    public static void write (Path inputPath, Path outputPath) throws FileNotFoundException {

        File inputFile = new File(inputPath.toUri());
        Scanner input = new Scanner(inputFile);
        List<Double> averages = new ArrayList<>();
        while (input.hasNext()) {
            String[] strings = input.nextLine().split(" ");

            double sum = 0;
            double average = 0;

            for (String stringNumber : strings) {
                sum += Double.parseDouble(stringNumber);
            }
            average = sum / strings.length;
            averages.add(average);
        }
        input.close();

        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputPath.toString()), "utf-8"));

            Iterator<Double> itr = averages.iterator();
            while (itr.hasNext()) {
                writer.write(itr.next() + "\n");
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {

            }
        }
    }


}
