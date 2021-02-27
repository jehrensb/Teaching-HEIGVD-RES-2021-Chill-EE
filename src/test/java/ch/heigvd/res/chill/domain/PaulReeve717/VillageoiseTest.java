package ch.heigvd.res.chill.domain.PaulReeve717;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VillageoiseTest {

  @Test
  void thePriceAndNameForVillageoiseShouldBeCorrect() {
    Villageoise beer = new Villageoise();
    assertEquals(beer.getName(), Villageoise.NAME);
    assertEquals(beer.getPrice(), Villageoise.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForVillageoise() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.PaulReeve717.Villageoise";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Villageoise.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}