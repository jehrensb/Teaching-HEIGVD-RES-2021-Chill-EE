package ch.heigvd.res.chill.domain.LoisDiserens;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JoratBlanche implements IProduct
{

    public final static String NAME = "Jorat Blanche";
    public final static BigDecimal PRICE = new BigDecimal(3.0); // Prix Chillout

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public BigDecimal getPrice()
    {
        return PRICE;
    }
}
