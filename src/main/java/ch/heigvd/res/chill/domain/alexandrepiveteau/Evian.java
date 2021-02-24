package ch.heigvd.res.chill.domain.alexandrepiveteau;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Evian implements IProduct {

  public static final String NAME = "Evian";
  public static final BigDecimal PRICE = new BigDecimal(2.95);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
