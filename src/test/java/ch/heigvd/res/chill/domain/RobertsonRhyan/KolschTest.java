package ch.heigvd.res.chill.domain.RobertsonRhyan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KolschTest {

  @Test
  void thePriceAndNameForKolschShouldBeCorrect() {
    Kolsch beer = new Kolsch();
    assertEquals(beer.getName(), Kolsch.NAME);
    assertEquals(beer.getPrice(), Kolsch.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKolsch() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.RobertsonRhyan.Kolsch";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kolsch.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}