package ch.heigvd.res.chill.domain.ggeggc;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeizeSoixanteQuatreTest {

    @Test
    void thePriceAndNameForSeizeSoixanteQuatreTesthouldBeCorrect() {
        SeizeSoixanteQuatre beer = new SeizeSoixanteQuatre();
        assertEquals(beer.getName(), SeizeSoixanteQuatre.NAME);
        assertEquals(beer.getPrice(), SeizeSoixanteQuatre.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSeizeSoixanteQuatre() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ggeggc.SeizeSoixanteQuatre";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SeizeSoixanteQuatre.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}