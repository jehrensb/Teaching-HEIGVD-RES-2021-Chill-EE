package ch.heigvd.res.chill.domain.Rosy1996;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TripelKarmeliet implements IProduct {

  public final static String NAME = "Tripel Karmeliet";
  public final static BigDecimal PRICE = new BigDecimal(3.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
