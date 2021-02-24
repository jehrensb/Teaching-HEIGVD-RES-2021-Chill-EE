package ch.heigvd.res.chill.domain.Gaetan2907;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Amsterdam implements IProduct {

  public final static String NAME = "Amsterdam";
  public final static BigDecimal PRICE = new BigDecimal(1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
