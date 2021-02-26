package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaFranche implements IProduct {

  public final static String NAME = "LaFranche";
  public final static BigDecimal PRICE = new BigDecimal(4.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
