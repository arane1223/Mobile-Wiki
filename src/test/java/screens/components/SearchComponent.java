package screens.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchComponent {
    protected SelenideElement
            searchContainer = $(accessibilityId("Search Wikipedia")),
            searchSrcText = $(id("org.wikipedia.alpha:id/search_src_text"));

    protected ElementsCollection
            pageListItemTitle = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public SelenideElement searchContainer() {
        return searchContainer;
    }

    public SelenideElement searchSrcText() {
        return searchSrcText;
    }

    public ElementsCollection pageListItemTitle() {
        return pageListItemTitle;
    }
}
