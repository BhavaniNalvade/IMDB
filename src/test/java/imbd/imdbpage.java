package imbd;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class imdbpage {
    private SelenideElement searchField = $(byName("q"));

    public void searchFor(String text) {
        searchField.val(text).pressEnter();
    }
}