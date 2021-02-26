package ch.heigvd.res.chill.domain.PaulReeve717;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CuveeDesSeigneurs implements IProduct {

  public final static String NAME = "Cuvée des Seigneurs";
  public final static BigDecimal PRICE = new BigDecimal(102);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
