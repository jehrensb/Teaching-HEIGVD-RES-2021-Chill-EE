package ch.heigvd.res.chill.domain.dosseggegw1;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaTest {
    @Test
    void thePriceAndNameForCoronaShouldBeCorrect(){
        Corona beer = new Corona();
        assertEquals(beer.getName(), Corona.NAME);
        assertEquals(beer.getPrice(), Corona.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCorona(){
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.dosseggegw1.Corona";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Corona.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice,response.getTotalPrice());
    }

}
