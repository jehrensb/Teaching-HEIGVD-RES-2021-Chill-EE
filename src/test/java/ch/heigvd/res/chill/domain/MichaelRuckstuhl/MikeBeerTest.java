package ch.heigvd.res.chill.domain.MichaelRuckstuhl;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.MichaelRuckstuhl.MikeBeer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MikeBeerTest {

  @Test
  void thePriceAndNameForMikeBeerShouldBeCorrect() {
    MikeBeer beer = new MikeBeer();
    assertEquals(beer.getName(), MikeBeer.NAME);
    assertEquals(beer.getPrice(), MikeBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMikeBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MichaelRuckstuhl.MikeBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MikeBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}