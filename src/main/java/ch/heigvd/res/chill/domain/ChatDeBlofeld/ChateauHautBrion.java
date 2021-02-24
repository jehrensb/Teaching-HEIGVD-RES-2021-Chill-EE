package ch.heigvd.res.chill.domain.ChatDeBlofeld;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ChateauHautBrion implements IProduct {

  public final static String NAME = "Château Haut-Brion";
  public final static BigDecimal PRICE = new BigDecimal(149.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
