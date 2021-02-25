package ch.heigvd.res.chill.domain.NicolasOgi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Brewdog implements IProduct {

  public final static String NAME = "Brewdog";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
