package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.exercise4.FileContentReverser;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 13:09
 */
class AverageWriterTest {

    @Test
    void write() throws IOException {
        AverageWriter.write(Path.of("src/main/resources/exercise5Files/numbers.txt"),
                Path.of("src/main/resources/exercise5Files/average-reversed.txt"));

        File averageReversed = new File(Paths.get( "src/main/resources/exercise5Files/average-reversed.txt").toUri());
        File  expected =  new File(Paths.get( "src/main/resources/exercise5Files/averages_expected.txt").toUri());
        Assertions.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(averageReversed));
    }

}