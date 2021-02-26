package ch.heigvd.res.chill.domain.godimatthieu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CaptainMorgan implements IProduct {
    public final static String NAME = "Captain Morgan";
    public final static BigDecimal PRICE = new BigDecimal(12.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
