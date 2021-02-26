package ch.heigvd.res.chill.domain.LoisDiserens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class JoratBlancheTest {

    @Test
    void PrixEtNomCorrectJoratBlanche() {
        JoratBlanche beer = new JoratBlanche();
        assertEquals(beer.getName(), JoratBlanche.NAME);
        assertEquals(beer.getPrice(), JoratBlanche.PRICE);
    }

    @Test
    void AccepterCommandePourJoratBlanche() {
        int nbBieresCommandees = 2;
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.LoisDiserens.JoratBlanche";
        OrderRequest request = new OrderRequest(nbBieresCommandees, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = JoratBlanche.PRICE.multiply(new BigDecimal(nbBieresCommandees));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}