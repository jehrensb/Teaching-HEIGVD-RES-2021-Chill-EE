package ch.heigvd.res.chill.domain.Nono98;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrouetteTest {

    @Test
    void thePriceAndNameForBrouetteShouldBeCorrect() {
        Brouette beer = new Brouette();
        assertEquals(beer.getName(), Brouette.NAME);
        assertEquals(beer.getPrice(), Brouette.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBrouette() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Nono98.Brouette";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Brouette.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
