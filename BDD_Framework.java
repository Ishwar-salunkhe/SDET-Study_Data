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


//Framework Structure
src/test/java
│
├── base
│   └── BaseClass.java
│
├── hooks
│   └── Hooks.java
│
├── pages
│   ├── LoginPage.java
│   └── HomePage.java
│
├── stepdefinitions
│   └── LoginPageStep.java
│
├── runners
│   └── TestRunner.java
│
└── utils
    ├── ExcelReader.java
    └── ConfigReader.java


 //Hooks class is used for setup and tear down purpose (Browser launch and Close the browser).If Hooks class is there then we can skip Base class


 //Test Runner Class
 @CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/failed-scenario.txt"
        }     
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

//How to re run Only failed test cases
//-Here will use rerun plugin for that, will add this plugin in the cucumber options and then
// -will create another test runner class to run the only failed test cases
//-will Provided the failed scenarion file path in feature file

 @CucumberOptions(
        features = "@target/failed-scenarios.txt",
        glue = "stepdefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",      
        }     
)
 
