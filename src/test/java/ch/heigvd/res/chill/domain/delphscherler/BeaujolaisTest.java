package ch.heigvd.res.chill.domain.delphscherler;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jehrensb.Guinness;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeaujolaisTest {

  @Test
  void thePriceAndNameForGuinnessShouldBeCorrect() {
    Beaujolais wine = new Beaujolais();
    assertEquals(wine.getName(), Beaujolais.NAME);
    assertEquals(wine.getPrice(), Beaujolais.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuinness() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.delphscherler.Beaujolais";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Beaujolais.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}