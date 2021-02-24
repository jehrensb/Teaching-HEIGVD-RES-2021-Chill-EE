package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChimaekTest
{


	@Test
	void thePriceAndNameForChimaekShouldBeCorrect()
	{
		Chimaek food = new Chimaek();
		assertEquals(food.getName(), Chimaek.NAME);
		assertEquals(food.getPrice(), Chimaek.PRICE);
	}

	@Test
	void aBartenderShouldAcceptAnOrderForChimaek()
	{
		Bartender     jane               = new Bartender();
		String        productName        = "ch.heigvd.res.chill.domain.wasadigi.Chimaek";
		OrderRequest  request            = new OrderRequest(4, productName);
		OrderResponse response           = jane.order(request);
		BigDecimal    expectedTotalPrice = Chimaek.PRICE.multiply(new BigDecimal(4));
		assertEquals(expectedTotalPrice, response.getTotalPrice());
	}

}
