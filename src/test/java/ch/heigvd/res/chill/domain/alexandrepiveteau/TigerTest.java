package ch.heigvd.res.chill.domain.alexandrepiveteau;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TigerTest {

  @Test
  void thePriceAndNameForTigerShouldBeCorrect() {
    final Tiger beer = new Tiger();
    assertEquals(beer.getPrice(), Tiger.PRICE);
    assertEquals(beer.getName(), Tiger.NAME);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTiger() {
    final Bartender john = new Bartender();
    final String productName = "ch.heigvd.res.chill.domain.alexandrepiveteau.Tiger";
    final OrderRequest request = new OrderRequest(3, productName);
    final OrderResponse response = john.order(request);
    final BigDecimal expectedPrice = Tiger.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedPrice, response.getTotalPrice());
  }
}
