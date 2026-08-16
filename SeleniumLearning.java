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

