package ch.heigvd.res.chill.domain.arbroween;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TacticalNuclearPenguin implements IProduct {

  public final static String NAME = "TacticalNuclearPenguin";
  public final static BigDecimal PRICE = new BigDecimal(2.7);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
