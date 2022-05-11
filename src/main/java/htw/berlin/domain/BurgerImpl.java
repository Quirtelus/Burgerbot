package htw.berlin.domain;

import java.math.BigDecimal;
import java.util.List;

public class BurgerImpl implements Burger {

  private final List<Ingredient> ingredients;

  public BurgerImpl(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public BigDecimal calculatePrice() {
    // TODO (2): Gesamtpreis des Burgers auf Basis der Preise der Einzelzutaten berechnen
    BigDecimal price = new BigDecimal(0);
    for (Ingredient ingredient: ingredients)
    {
      price=price.add(ingredient.getPrice());
    }
    return price;
  }



  @Override
  public List<Ingredient> getIngredients() {
    return ingredients;
  }
}
