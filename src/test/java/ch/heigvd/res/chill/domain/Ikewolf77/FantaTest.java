package ch.heigvd.res.chill.domain.Ikewolf77;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FantaTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Fanta drink = new Fanta();
        assertEquals(drink.getName(), Fanta.NAME);
        assertEquals(drink.getPrice(), Fanta.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Duvel";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Duvel.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}