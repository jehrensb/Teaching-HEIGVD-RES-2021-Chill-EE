package ch.heigvd.res.chill.domain.NR09;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ProteinBeer implements IProduct {

    public final static String NAME = "Protein Beer";
    public final static BigDecimal PRICE = new BigDecimal(15);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
