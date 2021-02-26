package ch.heigvd.res.chill.domain.alecberney;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaSoeurBerney implements IProduct {

  public final static String NAME = "La Soeur Berney";
  public final static BigDecimal PRICE = new BigDecimal(4.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
