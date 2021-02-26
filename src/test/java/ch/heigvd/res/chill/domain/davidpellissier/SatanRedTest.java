package ch.heigvd.res.chill.domain.davidpellissier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.davidpellissier.SatanRed;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SatanRedTest {

  @Test
  void thePriceAndNameForSatanRedShouldBeCorrect() {
    SatanRed beer = new SatanRed();
    assertEquals(beer.getName(), SatanRed.NAME);
    assertEquals(beer.getPrice(), SatanRed.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSatanRed() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.davidpellissier.SatanRed";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SatanRed.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}