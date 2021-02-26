/*
 * @File Kamboucha.java
 * @Authors : David González León
 * @Date 26 févr. 2021
 */
package ch.heigvd.res.chill.domain.DavidGL17;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kamboucha implements IProduct {
   public final static String NAME = "Kamboucha";
   public final static BigDecimal PRICE = new BigDecimal(5);

   @Override
   public String getName() {
      return NAME;
   }

   @Override
   public BigDecimal getPrice() {
      return PRICE;
   }
}
