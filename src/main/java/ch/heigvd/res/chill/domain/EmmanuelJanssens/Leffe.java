package ch.heigvd.res.chill.domain.EmmanuelJanssens;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Leffe implements IProduct {

  public final static String NAME = "Leffe";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
