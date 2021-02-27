package ch.heigvd.res.chill.domain.NicolasOgi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrewdogTest {

  @Test
  void thePriceAndNameForBrewdogShouldBeCorrect() {
    Brewdog beer = new Brewdog();
    assertEquals(beer.getName(), Brewdog.NAME);
    assertEquals(beer.getPrice(), Brewdog.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBrewdog() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NicolasOgi.Brewdog";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Brewdog.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}