package ch.heigvd.res.chill.domain.doeni98;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chopfab implements IProduct {

    public final static String NAME = "Chopfab";
    public final static BigDecimal PRICE = new BigDecimal(1.59);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
