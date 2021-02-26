package ch.heigvd.res.chill.domain.QuentinForestier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NamurTest
{

  @Test
  void thePriceAndNameForNamurShouldBeCorrect() {
    Namur beer = new Namur();
    assertEquals(beer.getName(), Namur.NAME);
    assertEquals(beer.getPrice(), Namur.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNamur() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.QuentinForestier.Namur";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Namur.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}