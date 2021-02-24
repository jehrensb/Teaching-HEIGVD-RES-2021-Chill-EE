package ch.heigvd.res.chill.domain.Brassens;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Toucan implements IProduct {

  public final static String NAME = "Toucan";
  public final static BigDecimal PRICE = new BigDecimal(5.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
