package ch.heigvd.res.chill.domain.mhganh;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Mate implements IProduct {

  public final static String NAME = "Mate";
  public final static BigDecimal PRICE = new BigDecimal(2.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
