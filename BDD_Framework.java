/*Feature file for Login test

Feature: Login feature
Scenario Outline: Login test with valid credentials
Given User is on the login page
When User enters the username as "<username>"
And User enters the password as "<password>"
And User clicks on the login button
Then Verify user landed on the Home page

Examples:
| username | password |
| ishwar   | test123  |
*/


//Page Class
public class LoginPage {
 WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//input[@username='user']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Actions
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
