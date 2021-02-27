package ch.heigvd.res.chill.domain.Nono98;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaFinDuMonde implements IProduct {

    public final static String NAME = "La Fin Du Monde";
    public final static BigDecimal PRICE = new BigDecimal(5.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
