package ch.heigvd.res.chill.domain.dosseggegw1;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Boxer implements IProduct {

    public final static String NAME = "Boxer";
    public final static BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
