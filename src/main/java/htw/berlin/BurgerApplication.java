package htw.berlin;

import htw.berlin.service.BurgerBuilderImpl;
import htw.berlin.ui.ChatbotUI;
import htw.berlin.ui.CommaAndWhitespaceSplittingInputParser;
import htw.berlin.ui.UserInputWrapper;

public class BurgerApplication {

    public static void main(String[] args) {
        var parser = new CommaAndWhitespaceSplittingInputParser();
        var builder = new BurgerBuilderImpl();
        var ui = new ChatbotUI(new UserInputWrapper(System.in, System.out), builder, parser);
        ui.launch();
    }
}
