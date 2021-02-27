package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Celtia implements IProduct {

    public final static String NAME = "Celtia";
    public final static BigDecimal PRICE = new BigDecimal(0.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
