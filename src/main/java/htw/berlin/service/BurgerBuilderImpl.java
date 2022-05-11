package htw.berlin.service;

import htw.berlin.domain.*;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilderImpl implements BurgerBuilder {

  private final List<Ingredient> ingredients;

  public BurgerBuilderImpl() {
    this.ingredients = new ArrayList<>();
  }

  @Override
  public boolean addIngredientsById(List<Integer> ids) {
    // TODO (1): Fuer alle Artikel IDs aus `ids` mit Hilfe der Informationen aus `ArticleInfos` eine konkrete Ingredient-Instanz erzeugen und in der Liste `ingredients` ablegen
    ArticleInfosImpl articleInfos = ArticleInfosImpl.getInstance();
    var testm= articleInfos.getAllArticles();

    for (var pos= 0; pos<ids.size();pos++) {
      var id = ids.get(pos);
      ArticleData articleData = articleInfos.getAllArticles().get(id);

      if (articleInfos.buns.containsKey(id)) {
        Ingredient ingredient = new Bun(articleData.getName(), articleData.getPrice());
        ingredients.add(ingredient);
      }
      if (articleInfos.patties.containsKey(id)) {
        Ingredient ingredient = new Patty(articleData.getName(), articleData.getPrice());
        ingredients.add(ingredient);
      }
      if (articleInfos.salads.containsKey(id)) {
        Ingredient ingredient = new Salad(articleData.getName(), articleData.getPrice());
        ingredients.add(ingredient);
      }
      if (articleInfos.veggies.containsKey(id)) {
        Ingredient ingredient = new Veggie(articleData.getName(), articleData.getPrice());
        ingredients.add(ingredient);
      }
      if (articleInfos.sauces.containsKey(id)) {
        Ingredient ingredient = new Sauce(articleData.getName(), articleData.getPrice());
        ingredients.add(ingredient);
      }
    }

    return true;
  }

  @Override
  public Burger build() {

    return new BurgerImpl(ingredients);
  }
}
