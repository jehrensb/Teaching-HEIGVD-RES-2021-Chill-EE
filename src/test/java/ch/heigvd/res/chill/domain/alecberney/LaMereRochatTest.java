package ch.heigvd.res.chill.domain.alecberney;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaMereRochatTest {

  @Test
  void thePriceAndNameForLaMereRochatShouldBeCorrect() {
    LaMereRochat beer = new LaMereRochat();
    assertEquals(beer.getName(), LaMereRochat.NAME);
    assertEquals(beer.getPrice(), LaMereRochat.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaMereRochat() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.alecberney.LaMereRochat";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaMereRochat.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}