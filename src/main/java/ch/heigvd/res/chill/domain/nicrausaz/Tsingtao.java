package ch.heigvd.res.chill.domain.nicrausaz;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tsingtao implements IProduct {

  public final static String NAME = "Tsingtao";
  public final static BigDecimal PRICE = new BigDecimal(1.65);
  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
