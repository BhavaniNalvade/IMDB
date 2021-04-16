package imbd;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class imdbtest {
    @Test
    public void userCanSearch() {
        open("https://imdb.com");
        new imdbpage().searchFor("game of thrones");

        searchresultspage results = new searchresultspage();
        results.checkResultHasText("Game of Thrones: A Telltale Games Series");
       screenshot("imdb_pom");
    }
}