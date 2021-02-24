package ch.heigvd.res.chill.domain.kurisukun;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FaxeTest {

  @Test
  void thePriceAndNameForFaxeShouldBeCorrect() {
    Faxe beer = new Faxe();
    assertEquals(beer.getName(), Faxe.NAME);
    assertEquals(beer.getPrice(), Faxe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFaxe() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.kurisukun.Faxe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Faxe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}