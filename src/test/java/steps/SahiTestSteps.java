package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.SahiTestPageObjects;

public class SahiTestSteps {

    SahiTestPageObjects sahiTestPageObjects;

    @Step
    public void openMainPage() {
        sahiTestPageObjects.open();
    }

    @Step
    public void comeBackToMainPage() {
        sahiTestPageObjects.comeBackToMainPage();
    }

    @Step
    public void goToItestFrame() {
        sahiTestPageObjects.goToIframeTest();
    }

    @Step
    public void goToRigthFrame() {
        sahiTestPageObjects.switchToRigthFrame();
    }

    @Step
    public void goToWindowOpenTestOnRigthIframe() {
        sahiTestPageObjects.goToOpenWindowTest();
    }
    @Step
    public void goToLinkTest() {
        sahiTestPageObjects.goToOpenLinkTest();
    }

    @Step
    public void goToComeBackTwo() {
        sahiTestPageObjects.goToComeBackTwo();
    }


    @Step
    public void goToErrorPage() {
        sahiTestPageObjects.goToErrorPage();
    }

    @Step
    public void validateSahiPage(String labelText) {
        sahiTestPageObjects.verifySahiPage(labelText);
    }

    @Step
    public void validateErrorPage(String labelText) {
        sahiTestPageObjects.verifyErrorPage(labelText);
    }


    @Step
    public void validateSahiPageMain(String labelText) {
        sahiTestPageObjects.verifySahiPageMain(labelText);
    }


}
