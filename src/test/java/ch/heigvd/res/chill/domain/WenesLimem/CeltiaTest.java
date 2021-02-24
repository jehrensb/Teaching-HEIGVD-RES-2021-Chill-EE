package ch.heigvd.res.chill.domain.WenesLimem;


import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CeltiaTest {
    @Test
    void verifyNamePrice(){
        Celtia beer = new Celtia();
        assertEquals(beer.getName(),Celtia.NAME);
        assertEquals(beer.getPrice(),Celtia.PRCIE);
    }
    @Test
    void verifyCommunication() {
        Bartender jessica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.WenesLimem.Celtia";
        OrderRequest request = new OrderRequest(4,productName);
        OrderResponse response = jessica.order(request);
        BigDecimal totalPrice = Celtia.PRCIE.multiply(new BigDecimal(4));
        assertEquals(totalPrice,response.getTotalPrice());

    }
}
