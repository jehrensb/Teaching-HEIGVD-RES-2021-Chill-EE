package ch.heigvd.res.chill.domain.RebeccaTevaearai;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PoggerinoTest {
    @Test
    void thePriceAndNameForPoggerinoShouldBeCorrect() {
        Poggerino beer = new Poggerino();
        assertEquals(beer.getName(), Poggerino.NAME);
        assertEquals(beer.getPrice(), Poggerino.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPoggerino() {
        Bartender jesus = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RebeccaTevaearai.Poggerino";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jesus.order(request);
        BigDecimal expectedTotalPrice = Poggerino.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}