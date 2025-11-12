package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class StartScreen {
    protected SelenideElement
            primaryTextView = $(id("org.wikipedia.alpha:id/primaryTextView")),
            forwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            doneButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    @Step("Проверить текст на приветственной странице")
    public StartScreen verifyWelcomePage(String text) {
        primaryTextView.shouldHave(text(text));
        return this;
    }

    @Step("Нажать на кнопку «Continue»")
    public StartScreen clickOnForwardButton() {
        forwardButton.click();
        return this;
    }

    @Step("Нажать на кнопку «Get started»")
    public StartScreen clickOnDoneButton() {
        doneButton.click();
        return this;
    }
}
