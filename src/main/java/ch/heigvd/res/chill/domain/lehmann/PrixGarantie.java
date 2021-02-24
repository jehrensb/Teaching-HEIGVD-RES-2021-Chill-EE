package ch.heigvd.res.chill.domain.lehmann;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class PrixGarantie implements IProduct {

    public final static String NAME = "Prix Garantie";
    public final static BigDecimal PRICE = new BigDecimal(0.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}

