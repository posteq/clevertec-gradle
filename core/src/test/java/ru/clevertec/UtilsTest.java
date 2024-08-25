package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers_TrueReturn() {
        assertTrue(Utils.isAllPositiveNumbers("12","1.02"));
    }
    @Test
    void isAllPositiveNumbers_FalseReturnFirst() {
        assertFalse(Utils.isAllPositiveNumbers(" ","1.02"));
    }
    @Test
    void isAllPositiveNumbers_FalseReturnSecond() {
        assertFalse(Utils.isAllPositiveNumbers(null,"-1"));
    }
}