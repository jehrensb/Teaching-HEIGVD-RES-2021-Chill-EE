package ch.heigvd.res.chill.domain.Gaetan2907;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingfisherTest {

  @Test
  void thePriceAndNameForKingfisherShouldBeCorrect() {
    Kingfisher beer = new Kingfisher();
    assertEquals(beer.getName(), Kingfisher.NAME);
    assertEquals(beer.getPrice(), Kingfisher.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKingfisher() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Gaetan2907.Kingfisher";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kingfisher.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}