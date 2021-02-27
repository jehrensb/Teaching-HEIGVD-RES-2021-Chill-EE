package ch.heigvd.res.chill.domain.roosemberth;

import java.math.BigDecimal;

import ch.heigvd.res.chill.domain.IProduct;

public class Kwak implements IProduct {
  public final static String NAME = "Kwak";
  public final static BigDecimal PRICE = new BigDecimal(2.57);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
