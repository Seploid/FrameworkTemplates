package ui.blocks;

import com.codeborne.selenide.SelenideElement;

public class BlockElement {

    protected SelenideElement baseElement;

    public BlockElement(SelenideElement element) {
        baseElement = element;
    }
}
