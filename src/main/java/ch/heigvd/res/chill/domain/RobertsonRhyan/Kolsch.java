package ch.heigvd.res.chill.domain.RobertsonRhyan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kolsch implements IProduct {

    public final static String NAME = "4Pines Kolsch";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
