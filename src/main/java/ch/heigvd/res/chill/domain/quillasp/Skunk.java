package ch.heigvd.res.chill.domain.quillasp;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

/*
 * Comme j'ai arrêté l'alcool, j'vais plutôt parler en terme de chanvre.
 *
 * J'ai eu l'occasion de tomber sur une variété assez fortement
 * sympathique. 
 */

public class Skunk implements IProduct {

    public final static String NAME = "Skunk";
    public final static BigDecimal PRICE = new BigDecimal(10.0);

    @Override
    public String getName() { return NAME; }

    @Override
    public BigDecimal getPrice() { return PRICE; }
}
