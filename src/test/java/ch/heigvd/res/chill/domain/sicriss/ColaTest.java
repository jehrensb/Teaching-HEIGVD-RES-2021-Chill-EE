package ch.heigvd.res.chill.domain.sicriss;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.sicriss.Cola;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaTest
{
    @Test
    void thePriceAndNameForAColaShouldBeCorrect()
    {
        Cola cola = new Cola();
        assertEquals(cola.getName(), Cola.NAME);
        assertEquals(cola.getPrice(), Cola.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer()
    {
        Bartender patrick = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sicriss.Cola";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = patrick.order(request);
        BigDecimal expectedTotalPrice = Cola.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}