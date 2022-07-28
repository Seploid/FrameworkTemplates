package steps;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import ui.pages.SearchPage;

public class SearchSteps extends AbstractSteps{
    @Autowired
    @Lazy
    SearchPage searchPage;

    @Then("I see results on the Search page")
    public void iSeeResultsOnTheSearchPage() {
        assert searchPage.getNumberOfResults() > 0;
    }
}
