package ch.heigvd.res.chill.domain.fabio10000;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LeffeBlonde implements IProduct {

  public final static String NAME = "Leffe Blonde";
  public final static BigDecimal PRICE = new BigDecimal(3.16);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
