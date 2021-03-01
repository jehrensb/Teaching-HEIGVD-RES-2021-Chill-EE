package ch.heigvd.res.chill.domain.jehrensb;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kilkenny implements IProduct {

  public final static String NAME = "Kilkenny";
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
