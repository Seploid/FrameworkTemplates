package ui.pages;

import annotations.PageObject;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

@PageObject
public class HomePage {

    private SelenideElement searchInput = $("input[name='q']");

    public void open() {
        Selenide.open("/");
    }

    public void search(String request) {
        searchInput.sendKeys(request + Keys.ENTER);
    }
}
