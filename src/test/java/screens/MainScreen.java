package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import screens.components.SearchComponent;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {
    protected SelenideElement
            headerImage = $(id("org.wikipedia.alpha:id/view_announcement_header_image")),
            announcementText = $(id("org.wikipedia.alpha:id/view_announcement_text"));

    SearchComponent searchComponent = new SearchComponent();

    @Step("Ввести текст в поисковую строку на главной странице")
    public MainScreen enteringTextIntoSearchBar(String text) {
        searchComponent.searchContainer().click();
        searchComponent.searchSrcText().sendKeys(text);
        return this;
    }

    @Step("Проверить найденный контент")
    public MainScreen checkTheFoundContent() {
        searchComponent.pageListItemTitle().shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Кликнуть по результату")
    public MainScreen clickOnResult(String result) {
        searchComponent.pageListItemTitle().findBy(text(result)).click();
        return this;
    }

    @Step("Проверить, что на главном экране есть поисковая строка")
    public MainScreen checkThatSearchContainerIsVisible() {
        searchComponent.searchContainer().shouldBe(visible);
        return this;
    }

    @Step("Проверить, что над заголовком есть изображение")
    public MainScreen checkThatHeaderImageIsVisible() {
        headerImage.shouldBe(visible);
        return this;
    }

    @Step("Проверить заголовок")
    public MainScreen checkHeader(String header) {
        announcementText.shouldHave(text(header));
        return this;
    }
}
