package ch.heigvd.res.chill.domain.KevinJordil;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BossbeerTest {

  @Test
  void thePriceAndNameForBossbeerShouldBeCorrect() {
    Bossbeer beer = new Bossbeer();
    assertEquals(beer.getName(), Bossbeer.NAME);
    assertEquals(beer.getPrice(), Bossbeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBossbeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.KevinJordil.Bossbeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Bossbeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}