package ch.heigvd.res.chill.domain.soso24soso;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JusDePommeTest {

  @Test
  void thePriceAndNameForJusDePommeShouldBeCorrect() {
    JusDePomme jus = new JusDePomme();
    assertEquals(jus.getName(), JusDePomme.NAME);
    assertEquals(jus.getPrice(), JusDePomme.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForJusDePomme() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.soso24soso.JusDePomme";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = JusDePomme.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}