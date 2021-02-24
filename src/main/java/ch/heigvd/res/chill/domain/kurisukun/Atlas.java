package ch.heigvd.res.chill.domain.kurisukun;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Atlas implements IProduct {

  public final static String NAME = "Atlas";
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
