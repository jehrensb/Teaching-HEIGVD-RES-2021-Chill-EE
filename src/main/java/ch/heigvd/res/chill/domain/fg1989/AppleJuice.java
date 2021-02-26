package ch.heigvd.res.chill.domain.fg1989;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class AppleJuice implements IProduct {
    public final static String NAME = "Apple Juice";
    public final static BigDecimal PRICE = new BigDecimal(1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}