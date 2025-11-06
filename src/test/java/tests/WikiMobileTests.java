package tests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

@Owner("sergeyglukhov")
@Tag("mobile")
@DisplayName("Тесты на поиск в мобильном приложении Wikipedia")
public class WikiMobileTests extends TestBase {

    @Test
    @DisplayName("Успешное открытие статьи")
    void successfulArticleOpeningTest() {

        step("Открыть поиск", () ->
                $(accessibilityId("Search Wikipedia")).shouldBe(visible).click());

        step("Ввести запрос «board game»", () ->
                $(id("org.wikipedia.alpha:id/search_src_text"))
                        .shouldBe(visible)
                        .sendKeys("board game"));

        step("Явно подождать появления хотя бы одного результата", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));

        step("Клик по результату", () -> {
            SelenideElement article = $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                    .findBy(text("Board game"));
            article.shouldBe(visible).click();
        });

        step("Проверить, что заголовок статьи верен ", () ->
                $(id("org.wikipedia.alpha:id/view_page_title_text"))
                        .shouldHave(text("Board game"))
                        .shouldBe(visible));
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