package pageObjects;

import org.openqa.selenium.By;

public class pagePaths {
    public static By NewFormButton = By.xpath("//*[@id=\":1f\"]/div[1]");
    public static By FormTittlePath = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[2]/textarea");
    public static By FormDescriptionPath = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/span/div/div[1]/div[2]/textarea");
    public static By FirstQuestionInput = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span/div/div/div[1]/div[2]/textarea");
    public static By Option1of1 = By.xpath("//input[@value='Option 1']");
    public static By Option2of1 = By.xpath("//input[@value='Option 2']");
    public static By Option3of1 = By.xpath("//input[@value='Option 3']");
    public static By Option1of2 = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/span/div/div/div[1]/input");
    public static By Option2of2 = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div/span/div/div/div[1]/input");
    public static By Option3of2 = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[3]/div[1]/div/span/div/div/div[1]/input");
    public static By AddAnotherQuestionButton = By.xpath("//div[@data-action-id='freebird-add-last-field']");
    public static By SecondQuestionInput = By.xpath("//*[@id=\"SchemaEditor\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/span/div/div/div[1]/div[2]/textarea");
    public static By SendButton = By.xpath("//*[@id=\"tJHJj\"]/div[1]/div[2]/div/div[6]/div");
    public static By EmailField = By.xpath("//*[@id=\"email\"]/div/div/div[1]/div[3]/div/div[1]/div/div[1]/input");
    public static By SendFormButton = By.xpath("//*[@id=\"email\"]/div/div/div[2]/div[2]/div[2]");
    public static By SearchBar = By.xpath("//*[@id=\"gs_lc50\"]/input[1]");
    public static By FirstResult = By.xpath("//div[div/div[text()='Example Form']]");
    public static By FormMenuDisplay = By.xpath("//*[@class='docs-homescreen-item-overflow']");
    public static By RemoveButton = By.xpath("//div[div/div/div/div[text()='Remove']]");
    public static By MoveToTrashButton = By.xpath("//*[@class='goog-buttonset-default docs-homescreen-modaldialog-default-button']");
}
