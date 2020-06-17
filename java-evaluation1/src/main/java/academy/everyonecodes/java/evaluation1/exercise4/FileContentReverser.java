package academy.everyonecodes.java.evaluation1.exercise4;

import java.io.*;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:41
 */
public class FileContentReverser {

    public static void reverse(Path inputPath, Path outputPath) throws FileNotFoundException {

        File inputFile = new File(inputPath.toUri());
        Scanner input = new Scanner(inputFile);
        LinkedList<String> lines = new LinkedList<>();
        while (input.hasNext()) {
            lines.add(input.nextLine());
        }
        input.close();

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputPath.toString()), "utf-8"));

            Iterator<String> itr = lines.descendingIterator();
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
