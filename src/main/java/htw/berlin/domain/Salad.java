package htw.berlin.domain;

import java.math.BigDecimal;

public class Salad extends AbstractIngredient{


    public Salad (String name,BigDecimal price){
            super(name,price);
    };

    @Override
    public String toString() {
        return this.getName()+" als Salatbeilage";
    }
}
