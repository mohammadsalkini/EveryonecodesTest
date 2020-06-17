package academy.everyonecodes.java.evaluation1.exercise4;

import ch.qos.logback.core.util.FileUtil;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 12:28
 */
class FileContentReverserTest {

    @Test
    void reverse() throws IOException {

        FileContentReverser.reverse(Path.of("src/main/resources/exercise4Files/lines.txt"),
                Path.of("src/main/resources/exercise4Files/lines-reversed.txt"));

         File linesReversed = new File(Paths.get( "src/main/resources/exercise4Files/lines-reversed.txt").toUri());
         File  expected =  new File(Paths.get( "src/main/resources/exercise4Files/lines-reversed_expected.txt").toUri());
        Assertions.assertEquals(FileUtils.readLines(expected), FileUtils.readLines(linesReversed));
    }
}