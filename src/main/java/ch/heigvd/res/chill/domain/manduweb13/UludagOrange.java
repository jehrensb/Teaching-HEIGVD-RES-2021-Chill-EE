package ch.heigvd.res.chill.domain.manduweb13;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class UludagOrange implements IProduct {

    public final static String NAME = "UludagOrange";
    public final static BigDecimal PRICE = new BigDecimal(2.25);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}