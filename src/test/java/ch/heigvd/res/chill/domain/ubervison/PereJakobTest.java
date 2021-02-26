package ch.heigvd.res.chill.domain.ubervison;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PereJakobTest {

    @Test
    void pereJakobPriceAndNameShouldBeCorrect() {
        PereJakob pereJakob = new PereJakob();
        assertEquals(pereJakob.getPrice(), PereJakob.PRICE);
        assertEquals(pereJakob.getName(), PereJakob.NAME);
    }

    @Test
    void bartenderShouldAcceptPereJakobOrder() {
        Bartender jakob = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ubervison.PereJakob";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jakob.order(request);
        BigDecimal expectedPrice = PereJakob.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedPrice, response.getTotalPrice());
    }

}
