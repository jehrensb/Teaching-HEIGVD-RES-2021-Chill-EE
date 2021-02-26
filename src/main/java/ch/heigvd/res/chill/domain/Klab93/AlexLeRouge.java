package ch.heigvd.res.chill.domain.Klab93;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class AlexLeRouge implements IProduct {

  public final static String NAME = "Alex Le Rouge";
  public final static BigDecimal PRICE = new BigDecimal(5.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
