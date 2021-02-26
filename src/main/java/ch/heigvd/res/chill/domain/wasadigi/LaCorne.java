package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaCorne implements IProduct {

  public final static String NAME = "La Corne";
  public final static BigDecimal PRICE = new BigDecimal(4.85);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
