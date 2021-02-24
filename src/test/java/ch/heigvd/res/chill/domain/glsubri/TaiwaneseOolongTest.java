package ch.heigvd.res.chill.domain.glsubri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.glsubri.TaiwaneseOolong;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaiwaneseOolongTest {

  @Test
  public void thePriceAndTheNameForTaiwaneseOolongShouldBeCorrect() {
    final TaiwaneseOolong tea = new TaiwaneseOolong();
    assertEquals(tea.getName(), TaiwaneseOolong.NAME);
    assertEquals(tea.getPrice(), TaiwaneseOolong.PRICE);
  }

  @Test
  public void aBartenderShouldAcceptAnOrderForTaiwaneseOolong() {
    Bartender jacques = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.glsubri.TaiwaneseOolong";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jacques.order(request);
    BigDecimal expectedPrice = TaiwaneseOolong.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedPrice, response.getTotalPrice());
  }
}
