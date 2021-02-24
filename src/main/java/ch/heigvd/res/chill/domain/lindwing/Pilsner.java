package ch.heigvd.res.chill.domain.lindwing;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pilsner implements IProduct {

    public final static String NAME = "Pilsner";
    public final static BigDecimal PRICE = new BigDecimal(2.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
