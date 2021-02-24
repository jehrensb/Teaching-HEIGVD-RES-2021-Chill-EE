package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaFrancheTest {

  @Test
  void thePriceAndNameForLaFrancheShouldBeCorrect() {
    LaFranche beer = new LaFranche();
    assertEquals(beer.getName(), LaFranche.NAME);
    assertEquals(beer.getPrice(), LaFranche.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaFranche() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.LaFranche";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaFranche.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}