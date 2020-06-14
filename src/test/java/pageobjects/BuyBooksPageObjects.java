package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class BuyBooksPageObjects extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuyBooksPageObjects.class);

    @FindBy(xpath = "//input[@name='user']")
    WebElementFacade userCheckBox;

    @FindBy(xpath = "//input[@name='password']")
    WebElementFacade passCheckBox;

    @FindBy(xpath = "//input[@class='button']")
    WebElementFacade loginButton;

    @FindBy(xpath = "//td[text()='Core Java']//following::input[@name='q'][1]")
    WebElementFacade boxCoreJava;

    @FindBy(xpath = "//td[text()='Ruby for Rails']//following::input[@name='q'][1]")
    WebElementFacade boxRubyForRails;

    @FindBy(xpath = "//td[text()='Python Cookbook']//following::input[@name='q'][1]")
    WebElementFacade boxPython;

    @FindBy(xpath = "//input[@value='Add']")
    WebElementFacade buttonAdd;

    @FindBy(xpath = "//input[@id='total']")
    WebElementFacade boxTotalAmount;


    public void login(String user, String pass) {
        userCheckBox.type(user);
        passCheckBox.type(pass);
        loginButton.click();
    }

    public void addBooks(String cantJava, String cantRuby, String cantPython) {
        boxCoreJava.type(cantJava);
        boxRubyForRails.type(cantRuby);
        boxPython.type(cantPython);
        buttonAdd.click();
    }

    public void verifyTotalAmount(int cantJava, int cantRuby, int cantPython) {

        int priceJava = 300;
        int priceRuby = 200;
        int pricePython = 350;

        String totalAmount = String.valueOf((priceJava * cantJava) + (priceRuby * cantRuby) + (pricePython * cantPython));

        if (totalAmount.equals(boxTotalAmount.getValue())) {
            LOGGER.info("OK, SCENARIO PASSED");
        } else {
            Assert.fail("THE TOTAL IS NOT THE SAME.");
        }

    }


}
