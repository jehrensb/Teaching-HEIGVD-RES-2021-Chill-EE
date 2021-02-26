package ch.heigvd.res.chill.domain.QuentinForestier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Namur implements IProduct {

  public final static String NAME = "Namur";
  public final static BigDecimal PRICE = new BigDecimal(2.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
