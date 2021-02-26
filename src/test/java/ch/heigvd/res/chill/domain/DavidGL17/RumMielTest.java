/*
 * @File RumMielTest.java
 * @Authors : David González León
 * @Date 26 févr. 2021
 */
package ch.heigvd.res.chill.domain.DavidGL17;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RumMielTest {
   @Test
   void thePriceAndNameForRumMielShouldBeCorrect() {
      RumMiel beer = new RumMiel();
      assertEquals(beer.getName(), RumMiel.NAME);
      assertEquals(beer.getPrice(), RumMiel.PRICE);
   }

   @Test
   void aBartenderShouldAcceptAnOrderForRumMiel() {
      Bartender jane = new Bartender();
      String productName = "ch.heigvd.res.chill.domain.DavidGL17.RumMiel";
      OrderRequest request = new OrderRequest(3, productName);
      OrderResponse response = jane.order(request);
      BigDecimal expectedTotalPrice = RumMiel.PRICE.multiply(new BigDecimal(3));
      assertEquals(expectedTotalPrice, response.getTotalPrice());
   }
}
