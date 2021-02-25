package ch.heigvd.res.chill.domain.Ga_3tan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Houleuse implements IProduct {

  public final static String NAME = "Houleuse";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
