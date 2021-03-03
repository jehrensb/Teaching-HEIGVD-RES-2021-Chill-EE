package ch.heigvd.res.chill.domain.mascot27;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiereFranchesMontagnesTest {

    @Test
    void thePriceAndNameForBfmShouldBeCorrect() {
        BiereFranchesMontagnes bfm = new BiereFranchesMontagnes();
        assertEquals(bfm.getName(), BiereFranchesMontagnes.NAME, "bfm's name is incorrect");
        assertEquals(bfm.getPrice(), BiereFranchesMontagnes.PRICE, "bfm's is incorrect");
    }

    @Test
    void aBartenderShouldAcceptAndOrderForBfm() {
        String productName = "ch.heigvd.res.chill.domain.mascot27.BiereFranchesMontagnes";
        int quantityToOrder = 3;
        Bartender bartender = new Bartender();
        OrderRequest request = new OrderRequest(quantityToOrder, productName);
        OrderResponse response = bartender.order(request);
        BigDecimal expectedTotalPrice = BiereFranchesMontagnes.PRICE.multiply(new BigDecimal(quantityToOrder));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
