package ch.heigvd.res.chill.domain.DavidGL17;/*
 * @File KambouchaTest.java
 * @Authors : David González León
 * @Date 26 févr. 2021
 */

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class KambouchaTest {
   @Test
   void thePriceAndNameForKambouchaShouldBeCorrect() {
      Kamboucha beer = new Kamboucha();
      assertEquals(beer.getName(), Kamboucha.NAME);
      assertEquals(beer.getPrice(), Kamboucha.PRICE);
   }

   @Test
   void aBartenderShouldAcceptAnOrderForKamboucha() {
      Bartender jane = new Bartender();
      String productName = "ch.heigvd.res.chill.domain.DavidGL17.Kamboucha";
      OrderRequest request = new OrderRequest(3, productName);
      OrderResponse response = jane.order(request);
      BigDecimal expectedTotalPrice = Kamboucha.PRICE.multiply(new BigDecimal(3));
      assertEquals(expectedTotalPrice, response.getTotalPrice());
   }
}