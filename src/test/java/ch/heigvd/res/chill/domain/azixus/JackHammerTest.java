package ch.heigvd.res.chill.domain.azixus;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JackHammerTest {

    @Test
    void thePriceAndNameForJackHammerShouldBeCorrect() {
        JackHammer beer = new JackHammer();
        assertEquals(beer.getName(), JackHammer.NAME);
        assertEquals(beer.getPrice(), JackHammer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJackHammer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.azixus.JackHammer";
        OrderRequest request = new OrderRequest(8, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = JackHammer.PRICE.multiply(new BigDecimal(8));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}