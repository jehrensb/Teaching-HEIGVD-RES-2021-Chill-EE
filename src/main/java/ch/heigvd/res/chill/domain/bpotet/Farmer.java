package ch.heigvd.res.chill.domain.bpotet;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Farmer implements IProduct {
    public final static String NAME = "Farmer";
    public final static BigDecimal PRICE = new BigDecimal(2.45);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
