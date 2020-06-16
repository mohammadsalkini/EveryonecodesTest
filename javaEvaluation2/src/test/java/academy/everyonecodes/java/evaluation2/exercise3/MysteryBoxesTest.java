package academy.everyonecodes.java.evaluation2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation2
 * @created 16.06.2020 - 16:22
 */
class MysteryBoxesTest {


    @BeforeEach
    void init() {
        Spaceship spaceship = new Spaceship("", "");
    }


    @Test
    void test1() {
        MysteryBoxes spareBox= new SparePartsBox("increases a spaceship’s health by the intensity amount");
        Assertions.assertEquals("Spare Parts | increases a spaceship’s health by the intensity amount", spareBox.toString());
    }

    @Test
    void test2() {
        MysteryBoxes spareBox= new WeaponsUpgradeBox("increases a spaceship’s damage by the intensity amount");
        Assertions.assertEquals("Weapons Upgrade | increases a spaceship’s damage by the intensity amount", spareBox.toString());
    }



}