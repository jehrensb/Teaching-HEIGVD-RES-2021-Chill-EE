package ch.heigvd.res.chill.domain.matt989253;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class OldRasputin implements IProduct {

    public final static String NAME = "Old Rasputin";
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