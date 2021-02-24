package ch.heigvd.res.chill.domain.qsaucy;
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Salamandre implements IProduct {

    public final static String NAME = "Salamandre";
    public final static BigDecimal PRICE = new BigDecimal(3.65);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}