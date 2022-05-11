package htw.berlin.domain;

import java.math.BigDecimal;

public class Veggie extends AbstractIngredient{


    public Veggie(String name,BigDecimal price){
        super(name, price);
    };


    @Override
    public String toString() {
        return this.getName()+" als Gemuesebeilage";
    }
}
