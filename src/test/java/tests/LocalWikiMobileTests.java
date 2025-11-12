package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

@Owner("sergeyglukhov")
@Tag("local")
@DisplayName("Тесты на поиск в мобильном приложении Wikipedia")
public class LocalWikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное открытие статьи")
    void successfulArticleOpeningTest() {
        back();
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
        back();
        mainScreen
                .enteringTextIntoSearchBar("Appium")
                .checkTheFoundContent();
    }
}