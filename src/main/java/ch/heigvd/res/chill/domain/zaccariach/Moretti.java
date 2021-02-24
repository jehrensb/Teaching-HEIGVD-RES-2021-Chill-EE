package ch.heigvd.res.chill.domain.zaccariach;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Moretti implements IProduct {

  public final static String NAME = "Moretti";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
