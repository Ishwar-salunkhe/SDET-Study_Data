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





