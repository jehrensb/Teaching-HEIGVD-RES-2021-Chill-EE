package ch.heigvd.res.chill.domain.sinyks;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorpilleTest {
    @Test
    void thePriceAndNameForTorpilleShouldBeCorrect() {
        Torpille beer = new Torpille();
        assertEquals(beer.getName(), Torpille.NAME);
        assertEquals(beer.getPrice(), Torpille.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTorpille() {
        Bartender bill = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sinyks.Torpille";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = bill.order(request);
        BigDecimal expectedTotalPrice = Torpille.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
