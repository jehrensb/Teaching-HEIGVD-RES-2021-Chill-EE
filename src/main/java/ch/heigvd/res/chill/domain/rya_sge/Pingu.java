package ch.heigvd.res.chill.domain.rya_sge;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pingu implements IProduct {
    public final static String NAME = "Pingu";
    public final static BigDecimal PRICE = new BigDecimal(10.0);
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}


