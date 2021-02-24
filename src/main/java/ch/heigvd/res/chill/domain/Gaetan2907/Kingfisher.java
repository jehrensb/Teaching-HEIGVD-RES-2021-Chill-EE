package ch.heigvd.res.chill.domain.Gaetan2907;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kingfisher implements IProduct {

  public final static String NAME = "Kingfisher";
  public final static BigDecimal PRICE = new BigDecimal(3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
