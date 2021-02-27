package ch.heigvd.res.chill.domain.Nono98;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Rivale implements IProduct {

    public final static String NAME = "Rivale";
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
