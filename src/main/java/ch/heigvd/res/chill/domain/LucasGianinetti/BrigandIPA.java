package ch.heigvd.res.chill.domain.LucasGianinetti;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class BrigandIPA implements IProduct {

    public final static String NAME = "BrigandIPA";
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

