package ch.heigvd.res.chill.domain.sicriss;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmirnoffTest
{
    @Test
    void thePriceAndNameForASmirnoffShouldBeCorrect()
    {
        Smirnoff ice = new Smirnoff();
        assertEquals(ice.getName(), Smirnoff.NAME);
        assertEquals(ice.getPrice(), Smirnoff.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSmirnoff()
    {
        Bartender patrick = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sicriss.Smirnoff";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = patrick.order(request);
        BigDecimal expectedTotalPrice = Smirnoff.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
