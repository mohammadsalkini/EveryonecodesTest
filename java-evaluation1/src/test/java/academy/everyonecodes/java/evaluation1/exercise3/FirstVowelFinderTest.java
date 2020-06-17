package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 11:30
 */
class FirstVowelFinderTest {

    @Test
    @DisplayName("find a value")
    void find1() {

        Assertions.assertEquals(Optional.of('e'), FirstVowelFinder.find("everyonecodes"));
    }

    @Test
    @DisplayName("return empty")
    void find2() {

        Assertions.assertNotEquals(Optional.of('o'), FirstVowelFinder.find("everyonecodes"));
    }

    @Test
    @DisplayName("find a value")
    void find3() {

        Assertions.assertEquals(Optional.of('u'), FirstVowelFinder.find("guillermo"));
    }
}