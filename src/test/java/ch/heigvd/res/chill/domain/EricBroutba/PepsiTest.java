package ch.heigvd.res.chill.domain.EricBroutba;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PepsiTest {

  @Test
  void thePriceAndNameForPepsiShouldBeCorrect() {
    Pepsi drink = new Pepsi();
    assertEquals(drink.getName(), Pepsi.NAME);
    assertEquals(drink.getPrice(), Pepsi.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPepsi() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.EricBroutba.Pepsi";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pepsi.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}