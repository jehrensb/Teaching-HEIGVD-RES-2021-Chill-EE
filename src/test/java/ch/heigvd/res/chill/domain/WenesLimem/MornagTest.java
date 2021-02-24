package ch.heigvd.res.chill.domain.WenesLimem;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MornagTest {
    @Test
    void verifyNamePrice(){
        Mornag beer = new Mornag();
        assertEquals(beer.getName(),Mornag.NAME);
        assertEquals(beer.getPrice(),Mornag.PRCIE);
    }
    @Test
    void verifyCommunication() {
        Bartender jessica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.WenesLimem.Mornag";
        OrderRequest request = new OrderRequest(4,productName);
        OrderResponse response = jessica.order(request);
        BigDecimal totalPrice = Mornag.PRCIE.multiply(new BigDecimal(4));
        assertEquals(totalPrice,response.getTotalPrice());

    }
}
