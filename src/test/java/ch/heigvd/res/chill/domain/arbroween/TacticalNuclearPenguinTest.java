package ch.heigvd.res.chill.domain.arbroween;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TacticalNuclearPenguinTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    TacticalNuclearPenguin beer = new TacticalNuclearPenguin();
    assertEquals(beer.getName(), TacticalNuclearPenguin.NAME);
    assertEquals(beer.getPrice(), TacticalNuclearPenguin.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.arbroween.TacticalNuclearPenguin";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TacticalNuclearPenguin.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}