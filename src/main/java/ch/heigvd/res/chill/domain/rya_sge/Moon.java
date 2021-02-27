package ch.heigvd.res.chill.domain.rya_sge;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Moon implements IProduct {
    public final static String NAME = "Moon";
    public final static BigDecimal PRICE = new BigDecimal(1000);
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}


