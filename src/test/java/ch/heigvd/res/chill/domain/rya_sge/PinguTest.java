package ch.heigvd.res.chill.domain.rya_sge;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PinguTest {

    @Test
    void thePriceAndNameForPinguShouldBeCorrect() {
        Pingu beer = new Pingu();
        assertEquals(beer.getName(),Pingu.NAME);
        assertEquals(beer.getPrice(),Pingu.PRICE);
    }
    @Test
    void aBartenderShouldAcceptAnOrderForPingu(){
        Bartender b = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.rya_sge.Pingu";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = b.order(request);
        BigDecimal expectedTotalPrice = Pingu.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}