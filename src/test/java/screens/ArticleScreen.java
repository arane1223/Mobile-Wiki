package screens;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.id;

public class ArticleScreen {
    protected ElementsCollection closeButtons = $$(id("org.wikipedia.alpha:id/closeButton"));

    @Step("Закрыть модальное окно")
    public ArticleScreen closeModalWindow() {
        closeButtons.first().shouldBe(visible).click();
        return this;
    }

    @Step("Проверить, что заголовок статьи существует и правильный")
    public ArticleScreen checkArticleTitle(String title) {
        $x("//android.view.View[@text='" + title + "']").shouldBe(visible);
        return this;
    }
}
