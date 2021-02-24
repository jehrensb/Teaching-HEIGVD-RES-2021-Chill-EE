package ch.heigvd.res.chill.domain.hansArn;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FdmTest {
    @Test
    void thePriceAndNameForFdmShouldBeCorrect() {
        FinDuMonde beer = new FinDuMonde();
        assertEquals(beer.getName(), FinDuMonde.NAME);
        assertEquals(beer.getPrice(), FinDuMonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFdm() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.hansArn.FinDuMonde";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = FinDuMonde.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
