package steps;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static helpers.userLogin.wait;
import static pageObjects.pagePaths.*;

public class stepsForm extends setup{
    //public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    @Given("Search the form {string}")
    public void searchTheFormFormToSearch(String FormSearch) {
        wait.until(ExpectedConditions.presenceOfElementLocated(SearchBar)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SearchBar)).sendKeys(FormSearch);
        wait.until(ExpectedConditions.presenceOfElementLocated(SearchBar)).sendKeys(Keys.ENTER);
    }

    //@001
    @Given("Click on create a new Form")
    public void clickOnCreateANewForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(NewFormButton)).click();
    }

    @Then("Fill the fields of tittle and description with {string} and {string}")
    public void fillTheFieldsOfTittleAndDescription(String FormTittle, String FormDescription) {
        wait.until(ExpectedConditions.presenceOfElementLocated(FormTittlePath)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(FormTittlePath)).sendKeys(FormTittle);
        wait.until(ExpectedConditions.presenceOfElementLocated(FormTittlePath)).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(FormDescriptionPath)).sendKeys(FormDescription);
        wait.until(ExpectedConditions.presenceOfElementLocated(FormDescriptionPath)).sendKeys(Keys.ENTER);
    }

    @When("Fill the field of the first question with {string}")
    public void fillTheFieldOfTheFirstQuestionWithFirstQuestion(String FirstQuestion) {
        wait.until(ExpectedConditions.presenceOfElementLocated(FirstQuestionInput)).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(FirstQuestionInput)).sendKeys(FirstQuestion);
    }

    @Then("Fill the field 1-1 with {string}")
    public void fillTheFieldOfTheFirstAnswerWithFirstAnswer(String FirstAnswer) {
        WebElement option1 = wait.until(ExpectedConditions.presenceOfElementLocated(Option1of1));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option1.click();
        option1.sendKeys(FirstAnswer);
        option1.sendKeys(Keys.ENTER);
    }

    @Then("Fill the field 1-2 with {string}")
    public void fillTheFieldOfTheSecondAnswerWithSecondAnswer(String SecondAnswer) {
        WebElement option2 = wait.until(ExpectedConditions.presenceOfElementLocated(Option2of1));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option2.sendKeys(SecondAnswer);
        option2.sendKeys(Keys.ENTER);
    }

    @Then("Fill the field 1-3 with {string}")
    public void fillTheFieldOfTheThirdAnswerWithString(String ThirdAnswer) {
        WebElement option3 = wait.until(ExpectedConditions.presenceOfElementLocated(Option3of1));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option3.sendKeys(ThirdAnswer);
    }

    /***
     * @Then("Fill the field of the {string} answer with {string}")
     * public void fillField(String answerOption, String answerString) {
     *     WebElement option = wait.unitl(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='"+answerOption+"']")));
     *             try{
     *             Thread.sleep(1000);
     *         } catch (InterruptedException e) {
     *             e.printStackTrace();
     *         }
     *         option3.sendKeys(answerString);
     *         option3.sendKeys(Keys.ENTER);
     * }
     */

    @When("Click on add another question")
    public void clickOnAddAnotherQuestion() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AddAnotherQuestionButton)).click();
    }

    @Then("Fill the field of the second question with {string}")
    public void fillTheFieldOfTheSecondQuestionWithSecondQuestion(String SecondQuestion) {
        wait.until(ExpectedConditions.presenceOfElementLocated(SecondQuestionInput)).sendKeys(SecondQuestion);
    }

    @Then("Fill the field 2-1 with {string}")
    public void fillTheFirstFieldWithAnswer(String FirstAnswer) {
        WebElement option1 = wait.until(ExpectedConditions.presenceOfElementLocated(Option1of2));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option1.click();
        option1.sendKeys(FirstAnswer);
        option1.sendKeys(Keys.ENTER);
    }


    @Then("Fill the field 2-2 with {string}")
    public void fillTheSecondFieldWithAnswer(String SecondAnswer) {
        WebElement option2 = wait.until(ExpectedConditions.presenceOfElementLocated(Option2of2));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option2.sendKeys(SecondAnswer);
        option2.sendKeys(Keys.ENTER);
    }

    @Then("Fill the field 2-3 with {string}")
    public void fillTheThierdFieldWithAnswer(String ThirdAnswer) {
        WebElement option3 = wait.until(ExpectedConditions.presenceOfElementLocated(Option3of2));
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        option3.sendKeys(ThirdAnswer);
    }

    @When("Click on the send button")
    public void clickOnTheSendButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(SendButton)).click();
    }

    @Then("Fill the field of the mail to send to {string}")
    public void fillTheFieldOfTheMailToSend(String Email) {
        wait.until(ExpectedConditions.presenceOfElementLocated(EmailField)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(EmailField)).sendKeys(Email);
    }

    @Then("Send the form")
    public void sendTheForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(SendFormButton)).click();
    }

    //@002
    @Then("Delete form")
    public void deleteForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(FormMenuDisplay)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(RemoveButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MoveToTrashButton)).click();
    }

    //@003
    @When("Click on the form")
    public void clickOnTheForm() {
        wait.until(ExpectedConditions.presenceOfElementLocated(FirstResult)).click();
    }

    //004
    @Then("Check the results")
    public void checkTheResults() {
        Assert.isTrue(wait.until(ExpectedConditions.presenceOfElementLocated(FirstResult)).isDisplayed(), "The result is not the expected");
    }


}
