package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chimaek implements IProduct
{

	public final static String     NAME  = "Chimaek";
	public final static BigDecimal PRICE = new BigDecimal(12.99);

	@Override
	public String getName()
	{
		return NAME;
	}

	@Override
	public BigDecimal getPrice()
	{
		return PRICE;
	}
}
