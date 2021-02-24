package ch.heigvd.res.chill.domain.tiffanybonzon;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VagabondeTest {

  @Test
  void thePriceAndNameForVagabondeShouldBeCorrect() {
    Vagabonde beer = new Vagabonde();
    assertEquals(beer.getName(), Vagabonde.NAME);
    assertEquals(beer.getPrice(), Vagabonde.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForVagabonde() {
    Bartender jake = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.tiffanybonzon.Vagabonde";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jake.order(request);
    BigDecimal expectedTotalPrice = Vagabonde.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
