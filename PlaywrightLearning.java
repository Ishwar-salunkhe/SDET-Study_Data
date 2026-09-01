//launch Application in Playwright
Playwright playwright = Playwright.create();
Browser browser = playwright.chromium().launch();
BrowserContext context = browser.newContext();
Page page = context.newPage();
page.navigate("https://example.com");

// Playwright → Playwright class provided by the Playwright library.
// playwright → reference variable.
// Playwright.create() → creates/initializes a Playwright instance.
//Browser browser = playwright.chromium().launch(
    //new BrowserType.LaunchOptions().setHeadless(false)
//);
//Playwright Arhitecture is suing- WebSocket Protocol for communication- client and server


//To close
browser.close();

//To wait for the element
page.waitForSelector("#username");

Locator username = page.locator("#username");  //Locator is preferred because it is more reliable and supports auto-waiting.
//page.locator("//input[@id='username']");  //WE can use xpath like this as well
username.fill("admin");
//To Types characters one by one.
username.clear();  //To clear the textbox
username.type("admin"); //Older one
username.pressSequentialy("admin");  //Latest one

//Dropdown Handling
page.locator("#country").selectOption("India");

//Count==> Returns the number of elements matching the locator.
int count=page.locator("#username").count();

//Double Click
Locator.dblclick();

//Hover
page.locator("#country").hover();

//Drag To
Locator source = page.locator("#source");
Locator target = page.locator("#target");
source.dragTo(target);

//By visible label:
page.locator("#country").selectOption(
    new SelectOption().setLabel("India"));

//By value:
page.locator("#country").selectOption(
    new SelectOption().setValue("IN"));

//Alert Handling
page.onDialog(dialog -> {
    System.out.println(dialog.message());
    dialog.accept();
    dialog.dismiss();
});
//onDialog is a method 


//To Get All options from Drodown
Locator options = page.locator("#country option");

int count = options.count();

for (int i = 0; i < count; i++) {
    String optionText = options.nth(i).innerText();
    System.out.println(optionText);
}

//For checkbox:
page.locator("#terms").check();
//To uncheck:
page.locator("#terms").uncheck();
//For radio button:
page.locator("#male").check();

//To Take the screenshot
page.screenshot(new Page.ScreenshotOptions().setPath(Path.get("example.png"));

//Frame Handling
Locator frame = page.frameLocator("#myFrame") .locator("#username"); frame.fill("Ishwar");

//Mouse hiver action
page.locator("#menu").hover();

//Playwright provides the dragTo() method.
page.locator("#source").dragTo(
    page.locator("#target"));

//File Upload setInputFiles().
page.locator("input[type='file']")
    .setInputFiles("D:\\TestData\\sample.pdf");

//File download-waitForDownload().
Download download = page.waitForDownload(() -> {
    page.getByText("Download").click();
});

download.saveAs(
    Paths.get("D:\\Downloads\\file.pdf")
);

//Keyboard Actions
page.keyboard().press("Enter");
page.keyboard().press("Tab");
page.keyboard().press("Escape");
page.keyboard().press("Control+A"); 





