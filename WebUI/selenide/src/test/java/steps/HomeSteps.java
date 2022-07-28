package steps;

import io.cucumber.java.en.Given;
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

}
