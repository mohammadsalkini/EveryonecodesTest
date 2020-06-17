package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:37
 */
class VowelCounterTest {

    @Test
    @DisplayName("find a vowel")
    void count1() {

        Assertions.assertEquals(6, VowelCounter.count("everyonecodes"));
    }

    @Test
    @DisplayName("find a vowel")
    void count2() {

        Assertions.assertEquals(4, VowelCounter.count("guillermo"));
    }

    @Test
    @DisplayName("wrong assertion")
    void count3() {

        Assertions.assertNotEquals(7, VowelCounter.count("everyonecodes"));
    }
}