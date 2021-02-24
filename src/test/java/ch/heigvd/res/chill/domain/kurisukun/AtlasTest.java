package ch.heigvd.res.chill.domain.kurisukun;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtlasTest {

  @Test
  void thePriceAndNameForAtlasShouldBeCorrect() {
    Atlas beer = new Atlas();
    assertEquals(beer.getName(), Atlas.NAME);
    assertEquals(beer.getPrice(), Atlas.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAtlas() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.kurisukun.Atlas";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Atlas.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}