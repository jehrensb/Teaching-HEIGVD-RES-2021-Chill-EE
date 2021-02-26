package ch.heigvd.res.chill.domain.ubervison;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PereJakob implements IProduct {

    public final static String NAME = "Père Jakob";
    public final static BigDecimal PRICE = new BigDecimal(12.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
