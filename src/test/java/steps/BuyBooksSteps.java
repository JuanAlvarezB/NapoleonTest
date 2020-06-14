package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.BuyBooksPageObjects;

public class BuyBooksSteps {

    BuyBooksPageObjects buyBooksPageObjects;

    @Step
    public void openPage() {
        buyBooksPageObjects.open();
    }

    @Step
    public void loginOnPage(String user, String pass) {
        buyBooksPageObjects.login(user, pass);
    }

    @Step
    public void addBooks(String cantJava, String cantRuby, String cantPython) {
        buyBooksPageObjects.addBooks(cantJava, cantRuby, cantPython);
    }

    @Step
    public void verifyTotalAmount(int cantJava, int cantRuby, int cantPython) {
        buyBooksPageObjects.verifyTotalAmount(cantJava, cantRuby, cantPython);
    }

}
