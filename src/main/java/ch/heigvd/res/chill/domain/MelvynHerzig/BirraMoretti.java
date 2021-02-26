package ch.heigvd.res.chill.domain.MelvynHerzig;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BirraMoretti implements IProduct {

  public final static String NAME = "Birra Moretti";
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
