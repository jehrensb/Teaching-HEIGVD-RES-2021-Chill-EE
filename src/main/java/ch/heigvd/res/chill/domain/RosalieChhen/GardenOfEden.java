package ch.heigvd.res.chill.domain.RosalieChhen;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GardenOfEden implements IProduct {

    public final static String NAME = "Garden of eden";
    public final static BigDecimal PRICE = new BigDecimal(3.50);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
