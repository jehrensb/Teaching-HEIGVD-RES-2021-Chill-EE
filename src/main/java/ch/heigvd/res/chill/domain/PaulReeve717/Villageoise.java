package ch.heigvd.res.chill.domain.PaulReeve717;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Villageoise implements IProduct {

  public final static String NAME = "Villageoise";
  public final static BigDecimal PRICE = new BigDecimal(0.50);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
