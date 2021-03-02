package ch.heigvd.res.chill.domain.jwgit2;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class HakimStout implements IProduct {

  public final static String NAME = "Hakim Stout ";
  public final static BigDecimal PRICE = new BigDecimal(99);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
