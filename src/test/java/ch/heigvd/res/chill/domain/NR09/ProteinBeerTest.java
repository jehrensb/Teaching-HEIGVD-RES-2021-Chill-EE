package ch.heigvd.res.chill.domain.NR09;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProteinBeerTest {

    @Test
    void thePriceAndNameForProteinBeerShouldBeCorrect() {
        ProteinBeer beer = new ProteinBeer();
        assertEquals(beer.getName(), ProteinBeer.NAME);
        assertEquals(beer.getPrice(), ProteinBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForProteinBeer() {
        Bartender jake = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.NR09.ProteinBeer";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jake.order(request);
        BigDecimal expectedTotalPrice = ProteinBeer.PRICE.multiply(new BigDecimal(5));
         assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
