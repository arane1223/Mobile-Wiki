package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Owner("sergeyglukhov")
@Tag("browserstack")
@DisplayName("Тесты для мобильного приложения Wikipedia")
public class BrowserstackWikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное прохождение стартовых экранов и проверка компонентов на главном экране")
    void searchNewWikiTest() {
        startScreen
                .verifyWelcomePage("The Free Encyclopedia …in over 300 languages")
                .clickOnForwardButton()
                .verifyWelcomePage("New ways to explore")
                .clickOnForwardButton()
                .verifyWelcomePage("Reading lists with sync")
                .clickOnForwardButton()
                .verifyWelcomePage("Data & Privacy")
                .clickOnDoneButton();

        mainScreen
                .checkThatSearchContainerIsVisible()
                .checkThatHeaderImageIsVisible()
                .checkHeader("Customize your Explore feed");
    }

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