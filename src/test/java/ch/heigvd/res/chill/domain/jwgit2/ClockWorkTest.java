package ch.heigvd.res.chill.domain.jwgit2;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jwgit2.ClockWork;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockWorkTest {

  @Test
  void thePriceAndNameForClockWorkShouldBeCorrect() {
    ClockWork beer = new ClockWork();
    assertEquals(beer.getName(), ClockWork.NAME);
    assertEquals(beer.getPrice(), ClockWork.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForClockWork() {
    Bartender AAAAAAAAAAAAAAH = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jwgit2.ClockWork";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = AAAAAAAAAAAAAAH.order(request);
    BigDecimal expectedTotalPrice = ClockWork.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}