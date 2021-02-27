package ch.heigvd.res.chill.domain.soso24soso;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JusDePomme implements IProduct {

    public final static String NAME = "Jus de pomme";
    public final static BigDecimal PRICE = new BigDecimal(1.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
