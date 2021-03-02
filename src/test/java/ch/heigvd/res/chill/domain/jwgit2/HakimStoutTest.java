package ch.heigvd.res.chill.domain.jwgit2;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jwgit2.HakimStout;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HakimStoutTest {

  @Test
  void thePriceAndNameForHakimStoutShouldBeCorrect() {
    HakimStout beer = new HakimStout();
    assertEquals(beer.getName(), HakimStout.NAME);
    assertEquals(beer.getPrice(), HakimStout.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHakimStout() {
    Bartender hakim = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jwgit2.HakimStout";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = hakim.order(request);
    BigDecimal expectedTotalPrice = HakimStout.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}