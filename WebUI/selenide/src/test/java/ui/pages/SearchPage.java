package ui.pages;

import annotations.PageObject;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import ui.blocks.ResultItemElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

@PageObject
public class SearchPage {

    private ElementsCollection results = $$(".g");

    private List<ResultItemElement> resultItems = $$(".g").asDynamicIterable().stream().map(element -> new ResultItemElement(element)).collect(Collectors.toList());

    public int getNumberOfResults() {
        return resultItems.size();
    }

    public List<ResultItemElement> getResultItems() {
        return resultItems;
    }
}
