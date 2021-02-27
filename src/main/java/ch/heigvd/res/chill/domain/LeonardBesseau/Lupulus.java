package ch.heigvd.res.chill.domain.LeonardBesseau;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lupulus implements IProduct {

  public final static String NAME = "Lupulus";
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
