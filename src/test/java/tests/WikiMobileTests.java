package tests;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

@Owner("sergeyglukhov")
@DisplayName("Тесты на поиск в мобильной версии Wikipedia")
public class WikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное открытие статьи")
    void successfulArticleOpeningTest() {
        // Явное ожидание появления кнопки поиска
        $(AppiumBy.accessibilityId("Search Wikipedia"))
                .shouldBe(visible)
                .click();

        // Ожидание ввода текста поиска
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                .shouldBe(visible)
                .sendKeys("board game");

        // Ожидание появления результата поиска и проверка названия
        SelenideElement result = $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(text("Board game"))
                .shouldBe(visible);

        result.click();

        // Проверка, что открылась статья с нужным заголовком
        $(AppiumBy.id("org.wikipedia.alpha:id/view_page_title_text"))
                .shouldHave(text("Board game"))
                .shouldBe(visible);
    }



    @Test
    @DisplayName("Успешный поиск по слову «Appium»")
    void successfulSearchTest() {
        step("Ввести «Appium» в поисковую строку", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Проверить найденный контент", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}