package ru.sbt;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static java.lang.Math.round;
import static org.junit.Assert.assertEquals;

/**
 * Created by vyvko on 30.05.2017.
 */
public class CurrencyConverterTest {
    private CurrencyConverter converter;

    @Before
    public void init() {
        converter = new CurrencyConverter();
        converter.setBuyPrice(56.63);
        converter.setSellPrice(56.5775);
    }

    @Test
    public void buyLow() throws Exception {
        Double result = converter.buy(300.0);
        Double res = BigDecimal.valueOf(result).setScale(2,BigDecimal.ROUND_FLOOR).doubleValue();
        assertEquals(Double.valueOf(3.54), res);
    }

    @Test
    public void buyHigh() throws Exception {
        Double result = converter.buy(100000.0);
        Double res = BigDecimal.valueOf(result).setScale(2,BigDecimal.ROUND_FLOOR).doubleValue();
        assertEquals(Double.valueOf(1760.55), res);
    }

    @Test
    @Ignore
    public void sell() throws Exception {

    }

}