package ch.heigvd.res.chill.domain.godimatthieu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CaptainMorganTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        CaptainMorgan drink = new CaptainMorgan();
        assertEquals(drink.getName(), CaptainMorgan.NAME);
        assertEquals(drink.getPrice(), CaptainMorgan.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.godimatthieu.CaptainMorgan";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CaptainMorgan.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}