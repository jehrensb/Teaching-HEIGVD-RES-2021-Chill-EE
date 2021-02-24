package ch.heigvd.res.chill.domain.egremyb;

import ch.heigvd.res.chill.domain.IProduct;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class Hoegaarden implements IProduct {
    public final static String NAME = "Hoegaarden";
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
