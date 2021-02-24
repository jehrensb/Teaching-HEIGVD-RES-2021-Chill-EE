package ch.heigvd.res.chill.domain.WenesLimem;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BerberTest {
    @Test
    void verifyNamePrice(){
        Berber beer = new Berber();
        assertEquals(beer.getName(),Berber.NAME);
        assertEquals(beer.getPrice(),Berber.PRCIE);
    }
    @Test
    void verifyCommunication() {
        Bartender jessica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.WenesLimem.Berber";
        OrderRequest request = new OrderRequest(4,productName);
        OrderResponse response = jessica.order(request);
        BigDecimal totalPrice = Berber.PRCIE.multiply(new BigDecimal(4));
        assertEquals(totalPrice,response.getTotalPrice());

    }
}
