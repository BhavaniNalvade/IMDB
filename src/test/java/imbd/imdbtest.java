package imbd;


import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class imdbtest {
    public static void main(String[] args)
    {

            open("https://imdb.com");
            new imdbpage().searchFor("game of thrones");

            searchresultspage results = new searchresultspage();

            results.checkResultHasText("Game of Thrones: A Telltale Games Series");
            screenshot("IMDBcheck");

    }
}