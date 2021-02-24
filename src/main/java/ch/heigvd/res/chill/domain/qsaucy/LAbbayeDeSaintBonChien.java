package ch.heigvd.res.chill.domain.qsaucy;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LAbbayeDeSaintBonChien implements IProduct {

    public final static String NAME = "L'abbaye de Saint Bon-Chien";
    public final static BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}