package ui.pages;

import annotations.PageObject;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$$;

@PageObject
public class SearchPage {

    private ElementsCollection results = $$(".g");

    public int getNumberOfResults() {
        return results.size();
    }
}
