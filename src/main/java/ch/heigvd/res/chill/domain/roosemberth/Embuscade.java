package ch.heigvd.res.chill.domain.roosemberth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Embuscade implements IProduct {
  public final static String NAME = "Embuscade";
  public final static BigDecimal PRICE = new BigDecimal(3.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
