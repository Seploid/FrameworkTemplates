package ui.blocks;

import com.codeborne.selenide.SelenideElement;

public class ResultItemElement extends BlockElement {

    private SelenideElement headerElement = baseElement.$("h3");

    public ResultItemElement(SelenideElement element) {
        super(element);
    }

    public String getHeaderText() {
        return headerElement.text();
    }
}
