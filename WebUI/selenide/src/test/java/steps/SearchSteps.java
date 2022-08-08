package steps;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import ui.blocks.ResultItemElement;
import ui.pages.SearchPage;

public class SearchSteps extends AbstractSteps{
    @Autowired
    @Lazy
    SearchPage searchPage;

    @Then("I see results on the Search page")
    public void iSeeResultsOnTheSearchPage() {
        assert searchPage.getNumberOfResults() > 0;
    }

    @Then("headers of results contain {string} on Search page")
    public void headersOfResultsContainSelenideOnSearchPage(String expectedString) {
        for (ResultItemElement resultItem : searchPage.getResultItems()) {
            String actualHeaderOfItem = resultItem.getHeaderText();
            Assertions.assertThat(actualHeaderOfItem.toLowerCase()).as("Header of Search Result Item")
                    .contains(expectedString);
        }

    }
}
