package ch.heigvd.res.chill.domain.MazieroMarco;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class IceTea implements IProduct {

    public final static String NAME = "IceTea";
    public final static BigDecimal PRICE = new BigDecimal(1.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
