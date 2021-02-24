package ch.heigvd.res.chill.domain.bonzonlu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaVaudoise implements IProduct {
    public final static String NAME = "Jorat - La Vaudoise";
    public final static BigDecimal PRICE = new BigDecimal(3.65);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
