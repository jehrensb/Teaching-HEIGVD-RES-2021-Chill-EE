package ch.heigvd.res.chill.domain.junodch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Water implements IProduct {

  public final static String NAME = "Water";
  public final static BigDecimal PRICE = new BigDecimal(1.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
