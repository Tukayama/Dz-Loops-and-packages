package ru.netology.sgr;

public class SQRService {
    public int sguaresCalculator(int lowerValue, int upperValue) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if ((lowerValue < i * i) && (i * i < upperValue)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
