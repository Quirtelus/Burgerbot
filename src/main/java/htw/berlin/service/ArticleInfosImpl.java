package htw.berlin.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArticleInfosImpl implements ArticleInfos {

  private ArticleInfosImpl() {}

  private static ArticleInfosImpl instance;
  public static ArticleInfosImpl getInstance(){
    if(instance==null)instance=new ArticleInfosImpl();
    return instance;
  }

  public  Map<Integer, ArticleData> buns = Map.of(
          123, new ArticleData("Burgerbrot", new BigDecimal("1.50")),
          200, new ArticleData("Ciabatta", new BigDecimal("1.90")));
  public  Map<Integer, ArticleData> patties  = Map.of(
          300, new ArticleData("Rindfleisch", new BigDecimal("4.50")),
          400, new ArticleData("Falafel", new BigDecimal("3.50")));
  public  Map<Integer, ArticleData> salads = Map.of(
          500, new ArticleData("Eisbergsalat", new BigDecimal("0.40")),
          600, new ArticleData("Rucolasalat", new BigDecimal("0.60")),
          1100,new ArticleData("Feldsalat",new BigDecimal("0.50")));
  public  Map<Integer, ArticleData> veggies = Map.of(
          700, new ArticleData("Tomate", new BigDecimal("0.70")),
          800, new ArticleData("Gurke", new BigDecimal("0.65")));
  public  Map<Integer, ArticleData> sauces = Map.of(
          900, new ArticleData("Ketchup", new BigDecimal("0.25")),
          1000, new ArticleData("Mayo", new BigDecimal("0.30")));

  @Override
  public  Map<Integer, ArticleData> getAllArticles() {
    Map<Integer, ArticleData> articles = new HashMap<>();
    articles.putAll(buns);
    articles.putAll(patties);
    articles.putAll(salads);
    articles.putAll(veggies);
    articles.putAll(sauces);
    return articles;
  }
  //NACH ÜBUNG
  @Override
  public  Set<String>getNames() {
  Set<String> set = new HashSet<String>();
  for(int id : ArticleInfosImpl.getInstance().getAllArticles().keySet()){
    if (ArticleInfosImpl.getInstance().getAllArticles().containsKey(id)){
      var name = getAllArticles().get(id).getName();
      set.add(name);
    }
  }
  return set ;
  }

  @Override
  public  Map<String,Integer>getIdMap(){
    Set<String>names =getNames();
    Map<String,Integer>result=new HashMap<>();
    for (String word : names){
      for(int id : getAllArticles().keySet()){
        if(getAllArticles().get(id).getName().equals(word)){
          result.put(word,id);
        }
      }
    }
    return result;
  }
}

class ArticleData {

  private final String name;
  private final BigDecimal price;


  ArticleData(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;

  }

}


