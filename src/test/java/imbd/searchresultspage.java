package imbd;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class searchresultspage {
    private ElementsCollection results = $$(".findList");

    public void checkResultHasText(String expectedText) {
        $$(".result_text a").findBy(text(expectedText)).click();
    }

    public ElementsCollection getResults() {
        return results;
    }
}