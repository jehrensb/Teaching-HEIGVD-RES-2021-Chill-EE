package ch.heigvd.res.chill.domain.ubervison;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaSorciereTest {

    @Test
    void pereJakobPriceAndNameShouldBeCorrect() {
        LaSorciere laSorciere = new LaSorciere();
        assertEquals(laSorciere.getPrice(), LaSorciere.PRICE);
        assertEquals(laSorciere.getName(), LaSorciere.NAME);
    }

    @Test
    void bartenderShouldAcceptLaSorciereOrder() {
        Bartender sorciere = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ubervison.LaSorciere";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = sorciere.order(request);
        BigDecimal expectedPrice = LaSorciere.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedPrice, response.getTotalPrice());
    }

}
