package ch.heigvd.res.chill.domain.FlorianMulhauser;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Torpille implements IProduct {

    public final static String NAME = "BFM: La Torpille";
    public final static BigDecimal PRICE = new BigDecimal(6.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
