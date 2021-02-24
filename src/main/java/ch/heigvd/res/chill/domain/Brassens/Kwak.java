package ch.heigvd.res.chill.domain.Brassens;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kwak implements IProduct {
    public final static String NAME = "Kwak";
    public final static BigDecimal PRICE = new BigDecimal(5.0);
    public final static String TOURNEE_GENERALE = "Tournee generale!";

    /**
     * @return Un message en francais annoncant une tournee generale
     */
    public String tourneeGenerale(){
        return TOURNEE_GENERALE;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
