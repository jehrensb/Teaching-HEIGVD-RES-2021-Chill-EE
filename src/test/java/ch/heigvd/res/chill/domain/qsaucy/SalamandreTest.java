package ch.heigvd.res.chill.domain.qsaucy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalamandreTest {

    @Test
    void thePriceAndNameForSalamandreShouldBeCorrect() {
        Salamandre beer = new Salamandre();
        assertEquals(beer.getName(), Salamandre.NAME);
        assertEquals(beer.getPrice(), Salamandre.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSalamandre() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.qsaucy.Salamandre";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Salamandre.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}