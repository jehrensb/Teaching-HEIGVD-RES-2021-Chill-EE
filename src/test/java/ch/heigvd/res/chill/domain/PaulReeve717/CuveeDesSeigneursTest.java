package ch.heigvd.res.chill.domain.PaulReeve717;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuveeDesSeigneursTest {

  @Test
  void thePriceAndNameForCuveeDesSeigneursShouldBeCorrect() {
    CuveeDesSeigneurs beer = new CuveeDesSeigneurs();
    assertEquals(beer.getName(), CuveeDesSeigneurs.NAME);
    assertEquals(beer.getPrice(), CuveeDesSeigneurs.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCuveeDesSeigneurs() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.PaulReeve717.CuveeDesSeigneurs";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = CuveeDesSeigneurs.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}