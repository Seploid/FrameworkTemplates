package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import ui.pages.HomePage;

public class HomeSteps extends AbstractSteps {

    @Autowired
    @Lazy
    private HomePage homePage;


    @Given("I open the Home page")
    public void iOpenHomePage() {
        homePage.open();
    }

    @When("I try to find {string} on the Home page")
    public void iTryToFindSelenideSpringOnTheHomePage(String searchRequest) {
        homePage.search(searchRequest);
    }
}
