package ch.heigvd.res.chill.domain.claire;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Corbeau implements IProduct {

    public final static String NAME = "Corbeau";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}