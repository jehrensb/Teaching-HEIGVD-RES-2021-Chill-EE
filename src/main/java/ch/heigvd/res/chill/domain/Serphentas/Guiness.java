package ch.heigvd.res.chill.domain.Serphentas;

import java.math.BigDecimal;

import ch.heigvd.res.chill.domain.IProduct;

/**
 * Guiness
 *
 * @author Serphentas
 *
 */
public class Guiness implements IProduct {
    public final static String NAME = "Guiness";
    public final static BigDecimal PRICE = new BigDecimal(4.20);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
