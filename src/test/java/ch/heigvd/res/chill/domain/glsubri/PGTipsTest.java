package ch.heigvd.res.chill.domain.glsubri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PGTipsTest {
    @Test
    void thePriceAndNameForPGTipsShouldBeCorrect() {
        PGTips tea = new PGTips();
        assertEquals(tea.getName(), PGTips.NAME);
        assertEquals(tea.getPrice(), PGTips.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPGTips() {
        Bartender jacques = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.glsubri.PGTips";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = jacques.order(request);
        BigDecimal expectedTotalPrice = PGTips.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
