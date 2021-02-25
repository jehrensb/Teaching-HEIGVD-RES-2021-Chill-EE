package ch.heigvd.res.chill.domain.NicolasOgi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Erdinger implements IProduct {

  public final static String NAME = "Erdinger";
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
