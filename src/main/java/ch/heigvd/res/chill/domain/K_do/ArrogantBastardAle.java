package ch.heigvd.res.chill.domain.K_do;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;


public class ArrogantBastardAle implements IProduct {

    public final static String NAME = "Arrogant Bastard Ale";
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
