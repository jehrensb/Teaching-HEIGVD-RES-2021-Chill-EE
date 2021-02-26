package ch.heigvd.res.chill.domain.AnthoJack;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Bilz implements IProduct {

  public final static String NAME = "Bilz";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
