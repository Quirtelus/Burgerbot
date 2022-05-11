package htw.berlin.domain;

import java.math.BigDecimal;

public class Patty extends AbstractIngredient{


    public Patty(String name,BigDecimal price){
        super(name, price);
    };

    @Override
    public String toString() {
        return getName();
    }
}
