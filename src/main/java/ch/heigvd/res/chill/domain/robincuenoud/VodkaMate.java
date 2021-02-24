package ch.heigvd.res.chill.domain.robincuenoud;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class VodkaMate implements IProduct {

    public final static String NAME = "Club Vodka Mate";
    public final static BigDecimal PRICE = new BigDecimal(5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
