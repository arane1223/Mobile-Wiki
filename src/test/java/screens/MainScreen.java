package screens;

import io.qameta.allure.Step;
import screens.components.SearchComponent;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;

public class MainScreen {
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
}
