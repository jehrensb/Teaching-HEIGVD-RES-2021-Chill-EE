package ch.heigvd.res.chill.domain.kayoumido;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GingerAle implements IProduct {

    public final static String NAME = "Ginger Ale";
    public final static BigDecimal PRICE = new BigDecimal(2.5);


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
