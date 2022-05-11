package htw.berlin.service;

import java.util.Map;
import java.util.Set;

public interface ArticleInfos {
    Map<Integer, ArticleData> getAllArticles();


    Set<String> getNames();

    Map<String,Integer>getIdMap();
}
