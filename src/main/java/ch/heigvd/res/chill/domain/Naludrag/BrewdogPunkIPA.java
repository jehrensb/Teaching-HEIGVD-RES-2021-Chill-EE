package ch.heigvd.res.chill.domain.Naludrag;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BrewdogPunkIPA implements IProduct {

    public final static String NAME = "Brewdog Punk IPA";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
