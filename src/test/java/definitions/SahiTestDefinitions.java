package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BuyBooksSteps;
import steps.SahiTestSteps;

public class SahiTestDefinitions {

    @Steps
    SahiTestSteps sahiTestSteps;
    @Steps
    BuyBooksSteps buyBooksSteps;

    @Given("^the user want to automate access to the sahitest's website$")
    public void theUserWantToAutomateAccessToTheSahitestSWebsite() {
        sahiTestSteps.openMainPage();
        sahiTestSteps.comeBackToMainPage();
    }

    @When("^the user enters the iframe section and right-click on window open test$")
    public void theUserEntersTheIframeSectionAndRightClickOnWindowOpenTest() {
        sahiTestSteps.goToItestFrame();
        sahiTestSteps.goToRigthFrame();
        sahiTestSteps.goToWindowOpenTestOnRigthIframe();
    }

    @When("^the user enters the iframe section and right-click on Error Page$")
    public void theUserEntersTheIframeSectionAndRightClickOnErrorPage() {
        sahiTestSteps.goToItestFrame();
        sahiTestSteps.goToRigthFrame();
        sahiTestSteps.goToErrorPage();
    }

    @Then("^the user verifies that he is on the expected page with the following text (.*)$")
    public void theUserVerifiesThatHeIsOnTheExpectedPageWithTheFollowingText(String labelText) {
        sahiTestSteps.validateSahiPage(labelText);
    }

    @Then("^the user verifies that he is on the eror page with the following text (.*)$")
    public void theUserVerifiesThatHeIsOnTheErorPageWithTheFollowingTextNotFound(String labelText) {
        sahiTestSteps.validateErrorPage(labelText);
    }

    @Given("^the user logs in with the credential user: (.*), and pass: (.*)\\.$")
    public void theUserLogsInWithTheCredentialUserAndPass(String user, String pass) {
        buyBooksSteps.openPage();
        buyBooksSteps.loginOnPage(user, pass);
    }

    @When("^the user buys the books cantJava (.*), cantRuby (.*), and cantPython (.*)$")
    public void theUserBuysTheBooksCantJavaCantRubyAndCantPython(String cantJava, String cantRuby, String cantPython) {
        buyBooksSteps.addBooks(cantJava, cantRuby, cantPython);
    }

    @Then("^the user verifies the total amount cantJava (.*), cantRuby (.*), and cantPython (.*)$")
    public void theUserVerifiesTheTotalAmount(int cantJava, int cantRuby, int cantPython) {
        buyBooksSteps.verifyTotalAmount(cantJava, cantRuby, cantPython);
    }

    @When("^the user navigates through the main menu of the website and select an option$")
    public void theUserNavigatesThroughTheMainMenuOfTheWebsiteAndSelectAnOption() {
        sahiTestSteps.goToLinkTest();
        sahiTestSteps.goToComeBackTwo();
    }


    @Then("^the user when returning to the main menu validates the label (.*)$")
    public void theUserValidatesThatHeIsOnTheExpectedPageWithTheLabelLinkTest(String labelText) {
        sahiTestSteps.validateSahiPageMain(labelText);

    }
}
