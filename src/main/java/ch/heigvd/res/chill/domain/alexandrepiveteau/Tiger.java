package ch.heigvd.res.chill.domain.alexandrepiveteau;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tiger implements IProduct {

  public static final String NAME = "Tiger";
  public static final BigDecimal PRICE = new BigDecimal(3.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
