package ch.heigvd.res.chill.domain.mascot27;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BiereFranchesMontagnes implements IProduct {

    public final static String NAME = "Bière des Franches-Montagnes";
    public final static BigDecimal PRICE = new BigDecimal(5.25);


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
