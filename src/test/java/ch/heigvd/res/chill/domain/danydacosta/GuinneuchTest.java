package ch.heigvd.res.chill.domain.danydacosta;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuinneuchTest {

  @Test
  void thePriceAndNameForGuinneuchShouldBeCorrect() {
    Guinneuch beer = new Guinneuch();
    assertEquals(beer.getName(), Guinneuch.NAME);
    assertEquals(beer.getPrice(), Guinneuch.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuinneuch() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.danydacosta.Guinneuch";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Guinneuch.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}