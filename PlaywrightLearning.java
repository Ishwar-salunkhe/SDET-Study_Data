Playwright playwright = Playwright.create();

Browser browser = playwright.chromium().launch();

BrowserContext context = browser.newContext();

Page page = context.newPage();

page.navigate("https://example.com");
