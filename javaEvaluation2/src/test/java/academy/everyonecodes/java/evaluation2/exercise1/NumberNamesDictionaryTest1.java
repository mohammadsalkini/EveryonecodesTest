package academy.everyonecodes.java.evaluation2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 15:24
 */
class NumberNamesDictionaryTest1 {

    @Test
    void getNumber1() {

        Assertions.assertEquals(Optional.of(2), NumberNamesDictionary.getNumber("two"));
    }

    @Test
    void getNumber2() {

        Assertions.assertNotEquals(Optional.of(2), NumberNamesDictionary.getNumber("four"));
    }

    @Test
    void getName() {
        Assertions.assertEquals(Optional.of("five"), NumberNamesDictionary.getName(5));

    }

    @Test
    void getName2() {
        Assertions.assertNotEquals(Optional.of("six"), NumberNamesDictionary.getName(7));

    }
}