package ch.heigvd.res.chill.domain.AliceThunderWind;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class IceTea implements IProduct {

  public final static String NAME = "Ice Tea";
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
