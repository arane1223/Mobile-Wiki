package tests.browserstack;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("sergeyglukhov")
@Tag("mobile")
@DisplayName("Тесты на поиск в мобильном приложении Wikipedia")
public class WikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное открытие статьи")
    void successfulArticleOpeningTest() {
        mainScreen
                .enteringTextIntoSearchBar("board game")
                .clickOnResult("Board game");

        articleScreen
                .closeModalWindow()
                .checkArticleTitle("Board game");
    }

    @Test
    @DisplayName("Успешный поиск по слову «Appium»")
    void successfulSearchTest() {
        mainScreen
                .enteringTextIntoSearchBar("Appium")
                .checkTheFoundContent();
    }
}