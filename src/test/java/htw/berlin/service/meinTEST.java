package htw.berlin.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class meinTEST {
    @Test
    @DisplayName("should see if the get names Method works ")
    void testgetNames(){
        Set<String> expected = new HashSet<>(Arrays.asList("Burgerbrot","Ciabatta","Rindfleisch","Falafel", "Eisbergsalat","Rucolasalat","Feldsalat", "Tomate","Gurke" ,"Ketchup", "Mayo"));
        assertEquals(expected, ArticleInfosImpl.getInstance().getNames());

    }
    @Test
    @DisplayName("should see if getIdMap works")
    void testgetIdMap(){
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Gurke",800);
        expected.put("Burgerbrot",123);
        expected.put("Ciabatta",200);
        expected.put("Falafel", 400);
        expected.put("Ketchup",900);
        expected.put("Rindfleisch",300);
        expected.put("Tomate",700);
        expected.put("Rucolasalat",600);
        expected.put("Eisbergsalat",500);
        expected.put("Mayo",1000);
        expected.put("Feldsalat",1100);

        assertEquals(expected, ArticleInfosImpl.getInstance().getIdMap());

    }
}
