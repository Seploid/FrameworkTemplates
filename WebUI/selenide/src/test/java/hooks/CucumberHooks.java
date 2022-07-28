package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.springframework.beans.factory.annotation.Value;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class CucumberHooks {

    @Before
    public void setup(Scenario scenario) {
        open("/");
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            System.out.println("Failed!!!!!!!!!!!!!!!!!!!!");
        }
        clearBrowserCookies();
    }
}
