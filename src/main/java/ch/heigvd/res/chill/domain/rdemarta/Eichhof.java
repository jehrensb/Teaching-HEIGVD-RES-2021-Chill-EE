package ch.heigvd.res.chill.domain.rdemarta;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Eichhof implements IProduct {

  public final static String NAME = "Eichhof";
  public final static BigDecimal PRICE = new BigDecimal(1.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
