package com.javarush.task.task14.task1417;

public class USD extends Money {
    public USD(double USD) {
        super(USD);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }


}
