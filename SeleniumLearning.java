//"Selenium WebDriver follows a client-server architecture.
//We write our test script using the Selenium WebDriver API, for example in Java.
//The WebDriver API communicates using the W3C WebDriver protocol with the browser-specific driver, such as ChromeDriver or GeckoDriver.
//The browser driver then communicates with the actual browser and performs the requested action.
//The response is sent back through the same communication path to our test script."

//Handling of Multiple Windows
Set<String> windows = driver.getWindowHandles();
for (String windowIDs : windows) {

    driver.switchTo().window(windowIDs);
    String title = driver.getTitle();
    if (title.contains("Google")) {
        System.out.println("Required window found");
        break;
    }
}

driver.switchTo().window(parentWindow);
switchTo().defaultContent(); //switch to main page

//Same Logic as above for New tabs 
WebElement openTabButton=driver.findElement(By.xpath("//button[text()='New Tab']"));
openTabButton.click();
Set<String> tabIds=driver.getWindowHandles();
for(String id:tabIds)
 {
    driver.switchTo().window(id);
    String pageTitle=driver.getTitle();
    if(pageTitle.contains("SDET-QA Blog"))
         {
            System.out.println("We are on the correct page :"+pageTitle);
            break;
        }
    }

//Explicit Wait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));

//IMplicitly Wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//All Driver Methods
1. driver.get()
2. driver.getTitle()
3. driver.getCurrentUrl()
4. driver.getPageSource()
5. driver.findElement()
6. driver.findElements()
7. driver.getWindowHandle()
8. driver.getWindowHandles()
9. driver.navigate().to()
10. driver.navigate().back()
11. driver.navigate().forward()
12. driver.navigate().refresh()
13. driver.switchTo().window()
14. driver.switchTo().frame()
15. driver.switchTo().parentFrame()
16. driver.switchTo().defaultContent()
17. driver.switchTo().alert()
18. driver.manage().window().maximize()
19. driver.manage().window().minimize()
20. driver.manage().window().fullscreen()
21. driver.manage().window().getSize()
22. driver.manage().window().setSize()
23. driver.manage().timeouts().implicitlyWait()
24. driver.manage().timeouts().pageLoadTimeout()
25. driver.manage().timeouts().scriptTimeout()
26. driver.manage().getCookies()
27. driver.manage().getCookieNamed()
28. driver.manage().addCookie()
29. driver.manage().deleteCookie()
30. driver.manage().deleteCookieNamed()
31. driver.manage().deleteAllCookies()
32. driver.close()
33. driver.quit()


//===>All Elements Methods
1. element.click()
2. element.sendKeys()
3. element.clear()
4. element.getText()
5. element.getAttribute()
6. element.getDomAttribute()
7. element.getDomProperty()
8. element.getTagName()
9. element.isDisplayed()
10. element.isEnabled()
11. element.isSelected()
12. element.getCssValue()
13. element.getLocation()
14. element.getSize()
15. element.getRect()
16. element.submit()

//====>Alert handling
Alert alert = driver.switchTo().alert();
alert.accept();        // Click OK
alert.dismiss();       // Click Cancel
alert.getText();       // Get alert message
alert.sendKeys("Text"); // Enter text in prompt 

//To Print and Get All Dropdown Options
WebElement drp = driver.findElement(By.xpath("path"));
Select ss = new Select(drp);
List<WebElement> allDrpOptions = ss.getOptions();
for (WebElement option : allDrpOptions)
{
    String optionName = option.getText();
    System.out.println(optionName);
}

//TakesScreenshot Code
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Screenshots\\test.png");
FileUtils.copyFile(source, destination);

//If we want to capture with date and time then
String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
File dest = new File("D:\\selenium\\screenshot_" + dateTime + ".png");
);

//Java script executor
JavascriptExecutor js= (JavascriptExecutor) driver;  //Type casting becuase driver is variable of WebDriver and if we want to use the same then we need to typecast
js.executeScript("arguments[0].scrollIntoView(true);",uploadFileText);
js.executeScript("arguments[0].click();",name);
js.executeScript("arguments[0].value='testJava';",name);
js.executeScript("window.scrollBy(0, 500);"); //Scroll By pixel

//Xapth and Xpath axex
//xpath by contains
//div[contains(text(),'Order food & groceries.')]
//button[contains(@id,'submit')]

//How to get all Cell values from table OR How to handle table
   List<WebElement> tableAllCellValues =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
   for(WebElement cellValues:tableAllCellValues)
    {
      System.out.println(cellValues.getText());
    }
      System.out.println(tableAllCellValues.size());  //Get size of table cell values

//To get All Column Name
//th= Table header
List<WebElement> tableHeaderRow =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
for(WebElement allColumnName:tableHeaderRow)
    {
       System.out.println(allColumnName.getText());
    }

//File Upload using send Keys  \n= new line charcter
WebElement uploadFileButton = driver.findElement(By.xpath("//input[@type='file' and @id='multipleFilesInput']"));
uploadFileButton.sendKeys("C:\\Screenshot\\imageNo1.png");  //For single file
uploadFileButton.sendKeys("C:\\Screenshot\\imageNo1.png\n" +"C:\\Screenshot\\imageNo2.png"); //For Multiple files

1. sendKeys()  → Best and recommended approach
2. Robot Class → When a native file popup must be handled
3. AutoIT      → Mainly for Windows native popup handling


 //Check file is exist or not
String path = "D:\\AutomationTestdata\\testData.xlsx";
File file = new File(path);
System.out.println(file.exists());

//To Read the Data from excel sheet
String excelDataSheet = "D:\\AutomationTestdata\\testData.xlsx";
FileInputStream file= new FileInputStream(excelDataSheet);  //FileInputStream opens the Excel file so that Java can read the data from it.
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet =workbook.getSheet("Sheet");
String cellValue=sheet.getRow(1).getCell(0).getStringCellValue();
System.out.println(cellValue);

//Similar we ave another method to get the Numeric Value
String cellValue=sheet.getRow(1).getCell(0).getNumericCellValue();

//At the end we can close the file and workbook
workbook.close();
file.close();

//Exceptions In selenium
NoSuchElementException -> //Locator incorrect, Element is not present in the DOM, Page is not loaded properly, Element is inside the frame
StaleElementReferenceException
ElementNotInteractableException -> //Selenium finds the element, but cannot interact with it.
//Selenium finds the element, but cannot interact with it.
//Element is Disabled, Hidden
 NoSuchWindowException ->//Selenium tries to switch to or interact with a browser window that does not exist.
 NoAlertPresentException
 ElementClickInterceptedException -> //It occurs when Selenium tries to click an element, but another element is covering/intercepting the click.
   /* //More Possible reasons
    -Popup/modal is covering the element
    -Loader/spinner is still displayed

    */

//Frame and Iframe handling
 driver.switchTo().frame(0);
 driver.switchTo().frame("loginFrame"); //By ID or Name
 WebElement frame = driver.findElement(By.id("loginFrame"));
 driver.switchTo().frame(frame);  //As webelement

 //Sample code by me
driver.switchTo().frame("courses-iframe");
WebElement courseLink=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
courseLink.click();
WebElement productText=driver.findElement(By.xpath("//h2[text()='Browse products']"));
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOf(productText));
if(productText.isDisplayed())
{
    System.out.println("We are on the frame");
}

driver.switchTo().defaultContent(); //Go back to main Page
    

//Drag And Drop Element
WebElement dragElement =driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement dropEle =driver.findElement(By.xpath("//div[@id='draggable']"));   
Actions act= new Actions(driver);
act.dragAndDrop(dragElement,dropEle).build().perform();

//To Select All Checkboxex
List<WebElement> checkboxes =driver.findElements(By.xpath("//input[contains(@value,'day') and @type='checkbox']"));
for(WebElement checkbox:checkboxes)
    {
        checkbox.click();
     }

//To Select first 3 checkboxex
List<WebElement> checkboxes =driver.findElements(By.xpath("//input[contains(@value,'day') and @type='checkbox']"));
 for(int i=0; i<=2; i++)
    {
       checkboxes.get(i).click();
    }

//To Select last 3 checkboxex
List<WebElement> checkboxes =driver.findElements(By.xpath("//input[contains(@value,'day') and @type='checkbox']"));
 for(int i=checkboxes.size()-1; i>=4; i--)  //either you can start from last one or start from 4th Iteration
    {
       checkboxes.get(i).click();
    }

//Keyboard Keys Actions
driver.findElement(By.id("search")).sendKeys("Selenium", Keys.ENTER);

//By Actions class
Actions actions = new Actions(driver);
actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
actions.sendKeys(Keys.ENTER);

//Page class sample with Page factory
public class HRM_LoginPage {

    WebDriver driver;

   //Locators
    @FindBy(xpath="//input[@placeholder='Username']")
    private WebElement usernameInput;

    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement passwordInput;

    @FindBy(xpath="//button[normalize-space(.)='Login']")
    private WebElement loginButton;

    //Constructor
   public HRM_LoginPage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

   //Actions Methods
   public void enterUsername(String username){
       usernameInput.sendKeys("Admin");
   }

   public void enterPassword(String password){
       passwordInput.sendKeys("admin123");
   }

   public void clickOnLoginButton(){
     loginButton.click();
   }

//How to Open chromebrowser in Incognito
ChromeOptions option= new ChromeOptions();
option.addArguments("--incognito");
WebDriver driver= new ChromeDriver(option);

//PageFactory
//We use PageFactory with POM to simplify WebElement initialization and keep locators and actions organized.
//Using @FindBy makes the Page Class cleaner and reduces repetitive driver.findElement() calls. 
//However, PageFactory is optional; POM can also be implemented using By locator
    
   
       
       
      



    
    





