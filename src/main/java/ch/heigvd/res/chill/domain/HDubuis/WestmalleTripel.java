package ch.heigvd.res.chill.domain.HDubuis;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class WestmalleTripel implements IProduct {
    public final static String NAME = "Westmalle Tripel";
    public final static BigDecimal PRICE = new BigDecimal(4.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
