package ch.heigvd.res.chill.domain.Gaetan2907;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmsterdamTest {

  @Test
  void thePriceAndNameForAmsterdamShouldBeCorrect() {
    Amsterdam beer = new Amsterdam();
    assertEquals(beer.getName(), Amsterdam.NAME);
    assertEquals(beer.getPrice(), Amsterdam.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAmsterdam() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Gaetan2907.Amsterdam";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Amsterdam .PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}