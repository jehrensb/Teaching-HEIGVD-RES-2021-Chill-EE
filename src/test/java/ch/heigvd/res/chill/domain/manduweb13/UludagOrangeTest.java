package ch.heigvd.res.chill.domain.manduweb13;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UludagOrangeTest {

    @Test
    void thePriceAndNameForUludagOrangeShouldBeCorrect() {
        UludagOrange beer = new UludagOrange();
        assertEquals(beer.getName(), UludagOrange.NAME);
        assertEquals(beer.getPrice(), UludagOrange.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForUludagOrange() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.manduweb13.UludagOrange";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice =
                UludagOrange.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}