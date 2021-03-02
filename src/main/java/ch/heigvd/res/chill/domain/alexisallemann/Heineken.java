package ch.heigvd.res.chill.domain.alexisallemann;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Heineken implements IProduct {

    public final static String NAME = "Heineken";
    public final static BigDecimal PRICE = new BigDecimal(2.4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}