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

Locator username = page.locator("#username");
username.fill("admin");

//Dropdown Handling
page.locator("#country").selectOption("India");

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
