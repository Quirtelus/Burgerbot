package htw.berlin.domain;

import java.math.BigDecimal;

public class Bun extends AbstractIngredient implements Ingredient {


    public Bun(String name,BigDecimal price){
        super(name, price);
    };

    @Override
    public String toString() {
        return this.getName();
    }
}
