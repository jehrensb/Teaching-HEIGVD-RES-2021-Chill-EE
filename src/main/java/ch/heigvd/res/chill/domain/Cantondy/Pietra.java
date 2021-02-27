package ch.heigvd.res.chill.domain.Cantondy;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pietra implements IProduct {

  public final static String NAME = "Pietra";
  public final static BigDecimal PRICE = new BigDecimal(3.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
