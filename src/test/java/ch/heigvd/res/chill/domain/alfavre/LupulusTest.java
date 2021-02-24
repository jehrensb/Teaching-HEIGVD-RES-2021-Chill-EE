package ch.heigvd.res.chill.domain.alfavre;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LupulusTest {
    @Test
    void thePriceAndNameForLupulusShouldBeCorrect() {
        Lupulus beer = new Lupulus();
        assertEquals(beer.getName(), Lupulus.NAME);
        assertEquals(beer.getPrice(), Lupulus.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLupulus() {
        Bartender bill = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.alfavre.Lupulus";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = bill.order(request);
        BigDecimal expectedTotalPrice = Lupulus.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
