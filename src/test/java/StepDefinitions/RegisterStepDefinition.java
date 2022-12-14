package StepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterStepDefinition {

RegisterPage register = new RegisterPage() ;
    @Given("user navigate to register page")
    public void register_Page () throws InterruptedException {

        register.registerLink.click();
    }

    public static void Select(WebElement dropbox, String value)
    {
        Select select = new Select(dropbox);
        select.selectByVisibleText(value);


    }


    @When("user select gender")
    public void userSelectGender() {
        register.genderButton().click();

    }

    @And("user enter first name")
    public void userEnterFirstName() {
    register.FirstName().sendKeys("ahmed");
    }

    @And("user enter last name")
    public void userEnterLastName() {
    register.LastName().sendKeys("abdo");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select(register.DateOfBirthDay(),"15" );
        Select(register.DateOfBirthMonth(),"March" );
        Select(register.DateOfBirthYear(), "1997");

    }

    @And("user enter email")
    public void userEnterEmail() {

       register.Email().sendKeys("test@example.com");
    }

    @And("user fills Password")
    public void userFillsPassword() {
    register.Password().sendKeys("Password1");
    }

    @And("user fills confirm password")
    public void userFillsConfirmPassword() {
    register.ConfirmPassword().sendKeys("Password1");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
register.RegisterButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        Assert.assertTrue(register.ConfirmationMessage().isDisplayed());
        Assert.assertEquals(register.ConfirmationMessage().getText(),"Your registration completed");
        String Green = register.ConfirmationMessage().getCssValue("color");
        System.out.println(Green);
        Assert.assertEquals(Green,"rgba(76, 177, 124, 1)");


    }


}
