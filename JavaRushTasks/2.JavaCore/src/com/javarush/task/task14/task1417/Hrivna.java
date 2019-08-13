package com.javarush.task.task14.task1417;

public class Hrivna extends Money {
    public Hrivna(double UAH) {
        super(UAH);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
