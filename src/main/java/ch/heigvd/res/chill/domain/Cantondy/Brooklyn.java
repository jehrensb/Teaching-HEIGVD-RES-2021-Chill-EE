package ch.heigvd.res.chill.domain.Cantondy;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Brooklyn implements IProduct {

  public final static String NAME = "Brooklyn";
  public final static BigDecimal PRICE = new BigDecimal(4.7);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
