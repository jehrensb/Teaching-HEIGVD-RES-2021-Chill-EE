package ch.heigvd.res.chill.domain.alexandrepiveteau;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvianTest {

  @Test
  public void thePriceAndTheNameForEvianShouldBeCorrect() {
    final Evian water = new Evian();
    assertEquals(water.getName(), Evian.NAME);
    assertEquals(water.getPrice(), Evian.PRICE);
  }

  @Test
  public void aBartenderShouldAcceptAnOrderForEvian() {
    Bartender alex = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.alexandrepiveteau.Evian";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = alex.order(request);
    BigDecimal expectedPrice = Evian.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedPrice, response.getTotalPrice());
  }
}
