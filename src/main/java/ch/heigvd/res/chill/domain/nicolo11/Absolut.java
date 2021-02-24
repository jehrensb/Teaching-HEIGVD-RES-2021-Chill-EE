package ch.heigvd.res.chill.domain.nicolo11;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Absolut implements IProduct {

  public final static String NAME = "Absolut";
  public final static BigDecimal PRICE = new BigDecimal(-22.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
