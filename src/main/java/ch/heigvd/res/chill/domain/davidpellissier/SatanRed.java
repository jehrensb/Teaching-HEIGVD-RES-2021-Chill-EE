package ch.heigvd.res.chill.domain.davidpellissier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SatanRed implements IProduct {

  public final static String NAME = "Satan red";
  public final static BigDecimal PRICE = new BigDecimal(2.22);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
