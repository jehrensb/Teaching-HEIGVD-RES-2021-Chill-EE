package ch.heigvd.res.chill.domain.mathiasmaillard;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValaisanneTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Valaisanne beer = new Valaisanne();
    assertEquals(beer.getName(), Valaisanne.NAME);
    assertEquals(beer.getPrice(), Valaisanne.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForValaisanne() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mathiasmaillard.Valaisanne";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Valaisanne.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}