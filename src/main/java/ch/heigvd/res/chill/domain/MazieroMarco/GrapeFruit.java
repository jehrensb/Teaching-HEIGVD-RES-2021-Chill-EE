package ch.heigvd.res.chill.domain.MazieroMarco;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GrapeFruit implements IProduct {

    public final static String NAME = "GrapeFruit";
    public final static BigDecimal PRICE = new BigDecimal(0.6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
