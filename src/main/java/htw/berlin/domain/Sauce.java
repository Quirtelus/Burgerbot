package htw.berlin.domain;

import java.math.BigDecimal;

public class Sauce extends AbstractIngredient implements Ingredient{


    public Sauce(String name,BigDecimal price){
        super(name, price);
    };

    @Override
    public String toString() {
        return this.getName()+" als Sauce";
    }
}
