package ui.pages;

import annotations.PageObject;
import com.codeborne.selenide.Selenide;

@PageObject
public class HomePage {

    public void open() {
        Selenide.open("/");
    }
}
