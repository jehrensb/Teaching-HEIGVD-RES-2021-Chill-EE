package ch.heigvd.res.chill.domain.mathias_maillard;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GreenTea implements IProduct {

  public final static String NAME = "Green Tea";
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
