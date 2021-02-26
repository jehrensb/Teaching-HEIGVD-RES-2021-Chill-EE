package ch.heigvd.res.chill.domain.LordTT;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Swaf implements IProduct {

  public final static String NAME = "Swaf";
  public final static BigDecimal PRICE = new BigDecimal(1.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
