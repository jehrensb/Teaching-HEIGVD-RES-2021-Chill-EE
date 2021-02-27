package ch.heigvd.res.chill.domain.dosseggegw1;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxerTest {
    @Test
    void thePriceAndNameForCoronaShouldBeCorrect(){
        Boxer beer = new Boxer();
        assertEquals(beer.getName(), Boxer.NAME);
        assertEquals(beer.getPrice(), Boxer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCorona(){
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.dosseggegw1.Boxer";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice,response.getTotalPrice());
    }

}