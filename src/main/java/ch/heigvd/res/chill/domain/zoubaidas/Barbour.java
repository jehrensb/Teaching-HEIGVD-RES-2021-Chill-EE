package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Barbour implements IProduct {

  public final static String NAME = "Barbour";
  public final static BigDecimal PRICE = new BigDecimal(19082.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
