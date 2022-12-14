package Pages;

import StepDefinitions.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public   RegisterPage ()
    {
        PageFactory.initElements(Hook.driver, this);

    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;


    public WebElement genderButton()
    {


        return Hook.driver.findElement(By.cssSelector("#gender-male"));


    }

    public WebElement FirstName()
    {

        return Hook.driver.findElement(By.cssSelector("#FirstName"));
    }

    public WebElement LastName()
    {

        return Hook.driver.findElement(By.cssSelector("#LastName"));

    }
    public WebElement DateOfBirthDay()
    {
        return Hook.driver.findElement(By.name("DateOfBirthDay"));


    }
    public WebElement DateOfBirthMonth()
    {
        return Hook.driver.findElement(By.name("DateOfBirthMonth"));


    }
    public WebElement DateOfBirthYear()
    {
        return Hook.driver.findElement(By.name("DateOfBirthYear"));


    }


    public WebElement Email()
    {

        return Hook.driver.findElement(By.cssSelector("#Email"));

    }

    public WebElement Password()
    {

        return Hook.driver.findElement(By.cssSelector("#Password"));

    }

    public WebElement ConfirmPassword()
    {

        return Hook.driver.findElement(By.cssSelector("#ConfirmPassword"));
    }

    public WebElement RegisterButton()
    {
        return Hook.driver.findElement(By.cssSelector("#register-button"));

    }

    public WebElement ConfirmationMessage()
    {

        return Hook.driver.findElement(By.className("result"));

    }






}
