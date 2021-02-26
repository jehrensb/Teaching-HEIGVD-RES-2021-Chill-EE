package ch.heigvd.res.chill.domain.alecberney;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaGrandeAMeylan implements IProduct {

  public final static String NAME = "La Grande à Meylan";
  public final static BigDecimal PRICE = new BigDecimal(3.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
