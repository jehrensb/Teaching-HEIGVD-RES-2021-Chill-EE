package ch.heigvd.res.chill.domain.MichaelRuckstuhl;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Guinness implements IProduct {

    public final static String NAME = "Guinness";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
