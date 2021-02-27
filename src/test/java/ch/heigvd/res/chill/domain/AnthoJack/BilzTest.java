package ch.heigvd.res.chill.domain.AnthoJack;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.AnthoJack.Bilz;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BilzTest {

  @Test
  void thePriceAndNameForBilzShouldBeCorrect() {
    Bilz beer = new Bilz();
    assertEquals(beer.getName(), Bilz.NAME);
    assertEquals(beer.getPrice(), Bilz.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBilz() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.AnthoJack.Bilz";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Bilz.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}