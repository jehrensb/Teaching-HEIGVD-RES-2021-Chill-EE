package ch.heigvd.res.chill.domain.ChatDeBlofeld;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChateauHautBrionTest {

  @Test
  void thePriceAndNameForChateauHautBrionShouldBeCorrect() {
    ChateauHautBrion wine = new ChateauHautBrion();
    assertEquals(wine.getName(), ChateauHautBrion.NAME);
    assertEquals(wine.getPrice(), ChateauHautBrion.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForChateauHautBrion() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.ChatDeBlofeld.ChateauHautBrion";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = ChateauHautBrion.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}