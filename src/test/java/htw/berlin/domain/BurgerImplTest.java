package htw.berlin.domain;

import htw.berlin.service.BurgerBuilder;
import htw.berlin.service.BurgerBuilderImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BurgerImplTest {
    @Test
    @DisplayName("should calculate the price ")
    void testcalcprice(){
        BurgerBuilder burgerBuilder = new BurgerBuilderImpl();
        List<Integer> ids= List.of(123,300,900);
        burgerBuilder.addIngredientsById(ids);
        Burger burger = burgerBuilder.build();

        assertEquals(new BigDecimal(6.25),burger.calculatePrice());

    }

}