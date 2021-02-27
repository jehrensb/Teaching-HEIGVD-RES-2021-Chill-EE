package ch.heigvd.res.chill.domain.TheSnekySnek;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Blast implements IProduct {

  public final static String NAME = "Blast";
  public final static BigDecimal PRICE = new BigDecimal(2.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
