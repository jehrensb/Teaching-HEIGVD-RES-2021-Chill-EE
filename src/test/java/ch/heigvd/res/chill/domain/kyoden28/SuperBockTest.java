package ch.heigvd.res.chill.domain.kyoden28;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jehrensb.Guinness;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperBockTest {

  @Test
  void thePriceAndNameForGuinnessShouldBeCorrect() {
    SuperBock beer = new SuperBock();
    assertEquals(beer.getName(), SuperBock.NAME);
    assertEquals(beer.getPrice(), SuperBock.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuinness() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.kyoden28.SuperBock";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SuperBock.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}