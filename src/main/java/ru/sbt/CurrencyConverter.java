package ru.sbt;

import java.util.Scanner;

/**
 * Created by vyvko on 30.05.2017.
 */
public class CurrencyConverter {
    private Double buyPrice;
    private Double sellPrice;

    public CurrencyConverter() {
    }

    public CurrencyConverter(Scanner in) {
        System.out.println("Введите цену покупки валюты");
        setBuyPrice(in.nextDouble());
        System.out.println("Введите цену продажи валюты");
        setSellPrice(in.nextDouble());
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double buy(Double roubles) {
        Double commission = Math.max(99, roubles * (0.3 / 100));
        return (roubles - commission) / buyPrice;
    }

    public Double sell(Double currency) {
        Double commission = Math.max(99, (currency * sellPrice * (0.3 / 100)));
        return ((currency * sellPrice) - commission);
    }
}
