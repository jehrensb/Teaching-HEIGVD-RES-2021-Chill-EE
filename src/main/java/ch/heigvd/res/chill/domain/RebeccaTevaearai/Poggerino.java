package ch.heigvd.res.chill.domain.RebeccaTevaearai;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Poggerino implements IProduct {

  public final static String NAME = "Poggerino";
  public final static BigDecimal PRICE = new BigDecimal(33);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
