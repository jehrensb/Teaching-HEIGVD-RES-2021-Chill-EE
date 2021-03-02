package ch.heigvd.res.chill.domain.jwgit2;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ClockWork implements IProduct {

  public final static String NAME = "ClockWork";
  public final static BigDecimal PRICE = new BigDecimal(3.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
