package ch.heigvd.res.chill.domain.sicriss;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SommerTest
{
    @Test
    void thePriceAndNameForAColaShouldBeCorrect()
    {
        Sommer sommer = new Sommer();
        assertEquals(sommer.getName(), Sommer.NAME);
        assertEquals(sommer.getPrice(), Sommer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer()
    {
        Bartender patrick = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sicriss.Sommer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = patrick.order(request);
        BigDecimal expectedTotalPrice = Sommer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
