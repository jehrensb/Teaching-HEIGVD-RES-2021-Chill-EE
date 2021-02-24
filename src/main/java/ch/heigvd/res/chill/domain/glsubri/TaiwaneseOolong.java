package ch.heigvd.res.chill.domain.glsubri;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TaiwaneseOolong implements IProduct {

  public static final String NAME = "Taiwanese Oolong";
  public static final BigDecimal PRICE = new BigDecimal(4.95);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
