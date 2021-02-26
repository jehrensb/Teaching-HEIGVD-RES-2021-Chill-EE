/*
 * @File RumMiel.java
 * @Authors : David González León
 * @Date 26 févr. 2021
 */
package ch.heigvd.res.chill.domain.DavidGL17;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class RumMiel implements IProduct {
   public final static String NAME = "Rum Miel";
   public final static BigDecimal PRICE = new BigDecimal(2.0);

   @Override
   public String getName() {
      return NAME;
   }

   @Override
   public BigDecimal getPrice() {
      return PRICE;
   }
}
