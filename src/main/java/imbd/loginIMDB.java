package imbd;

import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;


public class LoginImdb {
    @Test
    public void searchgot() {
        // set the chromedriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        //open imdb.com
        open("https://www.imdb.com/");
        //search for "games of thrones"
        $(By.id("suggestion-search")).setValue("Games of Thrones");

        //find and open Video Game related search results
        $(By.linkText("Game of Thrones")).shouldHave(exactText("(2012) (Video Game)")).click();

        //verify correct page is opened
        if (title().equals("Game of Thrones (Video Game 2012) - IMDb")) {
            System.out.println("Video Game Page Loaded");
        }
        //make a screenshot
        screenshot("IMDBcheck.png")

    }
}
