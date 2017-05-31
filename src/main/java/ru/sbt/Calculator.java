package ru.sbt;

import java.io.IOException;
import java.util.Currency;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator
{

    public static void main( String[] args )
    {
        Double buyPrice;
        Double trendingPrc;
        Integer monthsCnt;
        Double result;
        Double initialBudget;
        Double currencyBudget;
        Double endBudget;
        Double commission;
        Integer sharesCnt;



        System.out.println( "Hello World!" );
        Scanner in = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Введите цену покупки в USD");
        buyPrice = in.nextDouble();
        System.out.println("Введите предполагаемую доходность");
        trendingPrc = in.nextDouble();

        System.out.println("Введите начальный бюджет в RUB");
        initialBudget = in.nextDouble();

        currencyBudget = converter.buy(initialBudget);
        System.out.println("Сумма купленных USD = " + currencyBudget);


        commission = Math.max(99,converter.buy(currencyBudget / buyPrice));
        sharesCnt = (int)(Math.floor((currencyBudget-commission) / buyPrice));
        System.out.println("Количество купленных акций = " + sharesCnt);

        result = sharesCnt * (buyPrice * (1+trendingPrc/100));

     /*
       *//* System.out.println("Введите количество месяцев");
        monthsCnt = in.nextInt();*//*


        System.out.println("buyPrice = " + buyPrice);
        System.out.println("trendingPrc = " + trendingPrc);

        result = buyPrice * (1+trendingPrc/100);*/

        System.out.println("result = " + result);


    }



}
