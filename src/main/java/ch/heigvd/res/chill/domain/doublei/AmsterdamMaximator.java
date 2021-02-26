package ch.heigvd.res.chill.domain.doublei;


import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class AmsterdamMaximator implements IProduct {

    public final static String NAME = "Amsterdam Maximator";
    public final static BigDecimal PRICE = new BigDecimal(2.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
