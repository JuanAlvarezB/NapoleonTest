package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

@DefaultUrl("http://sahitest.com/demo/jsPopup.htm")
public class SahiTestPageObjects extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(SahiTestPageObjects.class);

    @FindBy(xpath = "//a[text()='Back']")
    WebElementFacade linkComeBack;

    @FindBy(xpath = "//a[text()='IFrames Test']")
    WebElementFacade iFrameTest;

    @FindBy(xpath = "//a[text()='Window Open Test']")
    WebElementFacade windowOpenTest;

    @FindBy(xpath = "//div[@id='another']//iframe")
    WebElementFacade iFrameRigth;

    @FindBy(xpath = "//h2[text()='Sahi Tests']")
    WebElementFacade sahiLabelValidation;

    @FindBy(xpath = "//frame[@name='top']")
    WebElementFacade iframeTopToVerify;

    @FindBy(xpath = "//a[text()='Error Pages']")
    WebElementFacade linkErrorPage;

    @FindBy(xpath = "//a[text()='404 Page']")
    WebElementFacade link404Page;

    @FindBy(xpath = "//h1[text()='Not Found']")
    WebElementFacade labelNotFoundToVerify;

    @FindBy(xpath = "//a[text()='Link Test']")
    WebElementFacade linkLinkTest;

    @FindBy(xpath = "//a[text()='Back']")
    WebElementFacade linkComeBackTwo;

    @FindBy(xpath = "//h2[text()='Sahi Tests']")
    WebElementFacade sahiMainPage;




    public void comeBackToMainPage() {
        linkComeBack.click();
    }

    public void goToIframeTest() {
        iFrameTest.click();
    }

    public void switchToRigthFrame() {
        getDriver().switchTo().frame(iFrameRigth);
    }

    public void goToOpenWindowTest(){
        windowOpenTest.click();
    }

    public void goToOpenLinkTest(){linkLinkTest.click(); }

    public void goToComeBackTwo(){linkComeBackTwo.click();}
    public void goToErrorPage(){
        linkErrorPage.click();
        link404Page.click();
    }

    public void verifySahiPage(String labelText){
        verifyCurrentPage(labelText,sahiLabelValidation);
    }

    public void verifyErrorPage(String labelText){
        verifyCurrentPage(labelText,labelNotFoundToVerify);
    }
    public void verifySahiPageMain(String labelText){
        verifyCurrentPage(labelText,sahiMainPage);
    }

    public void verifyCurrentPage(String textLabel, WebElementFacade webElementFacadeToVerify) {

        ArrayList tabs = new ArrayList(getDriver().getWindowHandles());

        if (tabs.size()>1){
            getDriver().switchTo().window(String.valueOf(tabs.get(1)));
            getDriver().switchTo().frame(iframeTopToVerify);
        }

        if (webElementFacadeToVerify.getText().equalsIgnoreCase(textLabel)) {
            LOGGER.info("OK, SCENARIO PASSED");
        } else {
            Assert.fail("YOU ARE NOT ON THE EXPECTED PAGE");
        }
    }

}
