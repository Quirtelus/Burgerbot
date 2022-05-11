package htw.berlin.domain;

import java.math.BigDecimal;

public abstract class AbstractIngredient implements Ingredient {
    private String name;
    private BigDecimal price;

    public AbstractIngredient(String name, BigDecimal price){
        this.name=name;
        this.price=price;
    };
    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

}
