package ru.netology.sgr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sguaresCalculator() {
        SQRService service = new SQRService();
        int lowerValue = 200;
        int upperValue = 300;
        int expected = 3;
        int actual = service.sguaresCalculator(lowerValue, upperValue);
        assertEquals(expected, actual);

    }

}