package ch.heigvd.res.chill.domain.moromir;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kozel implements IProduct {

    public final static String NAME = "Kozel";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
