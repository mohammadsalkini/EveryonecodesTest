package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:08
 */
class PictureNameExtractorTest {

    @Test
    void extractTest1() {

        Assertions.assertEquals("sunshine", PictureNameExtractor.extract("01222013SunshinePic.jpg"));
      }

    @Test
    void extractTest2() {

        Assertions.assertEquals("snowflake", PictureNameExtractor.extract("24122019SnowflakePic.jpg"));
    }

    @Test
    void extractTest3() {

        Assertions.assertEquals("dereks birthday", PictureNameExtractor.extract("01082003Dereks-BirthdayPic.jpg"));
    }


}