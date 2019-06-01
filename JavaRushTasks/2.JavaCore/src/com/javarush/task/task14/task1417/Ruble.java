package com.javarush.task.task14.task1417;

public class Ruble extends Money {
    public Ruble(double RUB) {
            super(RUB);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
