# Hausaufgabe 4
1. Implementieren Sie im Paket `domain` eine Klassenhierarchie mit einer abstrakten Klasse `AbstractIngredient`, welche das Interface `Ingredient` implementiert, sowie fünf konkreten Klassen `Bun`, `Patty`, `Salad`, `Veggie`, und `Sauce`, die allesamt von `AbstractIngredient` erben.
2. Implementieren Sie in der Klasse `BurgerBuilderImpl.java` die Methode `addIngredientsById()`. Prüfen Sie anschließend, ob der Test in `BurgerBuilderImplIntegrationTest.java` grün ist. 
3. Implementieren Sie in der Klasse `BurgerImpl.java` die Methode `calculatePrice()` und ergänzen Sie in der Testklasse `BurgerImplTest.java` einen sinnvollen Unit-Test.
4. Implementieren Sie in der Klasse `BurgerImpl.java` die Methode `calculateCalories()` und ergänzen Sie in der Testklasse `BurgerImplTest.java` einen sinnvollen Unit-Test.
5. Betrachten Sie die Testfälle `ChatbotIngredientIntegrationTest.java` und überschreiben Sie die `toString`-Methoden in Ihren Ingredient-Klassen so, dass die Tests grün werden (ohne dabei die Klasse `ChatbotUI` zu ändern). 
6. (Optional) Erweitern Sie die Klasse `ChatbotUI` so, dass man die eigene Bestellung nach der Frage "Willst du die Bestellung abschliessen?" nochmal korrigieren und z.B. weitere Zutaten zu dem bestellten Burger hinzufügen oder einen weiteren Burger zur Bestellung hinzufügen kann.   
