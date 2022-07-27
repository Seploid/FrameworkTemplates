package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends AbstractSteps {

    public int firstDigit;
    public int secondDigit;
    public int result;

    @Given("first digit is (.*)")
    public void firstDigitIs(int firstDigit) {
        this.firstDigit = firstDigit;
    }

    @Given("second digit is (.*)")
    public void secondDigitIs(int secondDigit) {
        this.secondDigit = secondDigit;
    }

    @When("I sum them")
    public void iSumThem() {
        this.result = this.firstDigit + this.secondDigit;
    }

    @Given("result is (.*)")
    public void resultIs(int result) {
        assert this.result == result;
    }
}
