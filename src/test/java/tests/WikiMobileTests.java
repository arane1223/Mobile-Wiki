package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

@Owner("sergeyglukhov")
@DisplayName("Тесты на поиск в мобильной версии Wikipedia")
public class WikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное открытие статьи")
    void successfulArticleOpeningTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("board games");


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