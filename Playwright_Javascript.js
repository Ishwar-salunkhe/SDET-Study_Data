import {test} from "@playwright/test" // It is called module- @playwright/test

test("Login test", async({page})=>{
     test.setTimeout(60000);  //We can add test level custome timeout if that test cases is required more timeout
     await page.goto("https://www.saucedemo.com/");
     await page.locator("//input[@id='user-name']").fill("standard_user");
     await page.locator("//input[@id='password']").fill("secret_sauce");
     await page.locator("//input[@id='login-button']").click();
     let status=await page.getByText("Swag Labs").isVisible()
     console.log("It Is visible "+status)
})

//If You do not use page fixture the you need to launch browser and app like below
import { test,chromium } from "@playwright/test";

test("test app",async()=> {

const browser=await chromium.launch();
const context=await browser.newContext();
const page=await context.newPage();
await page.goto("https://rahulshettyacademy.com/AutomationPractice/");
await page.goBack();  //Navigation from Browser back button
await page.goForward();     

})
//Custome Expect assertion timeout for test method level
const slowExpect = expect.configure({timeout : 9000});
await page.goto("https://testautomationpractice.blogspot.com/");
await slowExpect(await page.getByText("Automation Testing Practice")).toHaveText("Automation Testing Practice")

//Custome Expect assertion timeout for step level
await page.goto("https://testautomationpractice.blogspot.com/");
await expect(await page.getByText("Automation Testing Practice")).toBeVisible({timeout: 10000}); //Step level timeout


//Locators
    await page.getByPlaceholder("Enter Name").fill("John");
    await page.getByLabel("Name:").fill("John");
    await page.getByText("Data Entry Form");
    //To get text from we can use textContent() OR innerText() method
    console.log(await page.getByText("Data Entry Form").textContent());  //Direct Print
    //You can store the String in the element like below
    const DataEntrytext = await page.getByText("Data Entry Form").textContent()
    console.log(DataEntrytext);

    //GetByRole Locator ->  //If element is matching with multiple then use first()
    //For the getByRole-> It is accepting 2 params 1st as String and 2nd as Object -{ name: 'Sign in' }
    //getByRole- is indetify OR locate the element based on there accecible role
    await page.getByRole('button', { name: 'Sign in' }).first().click();
    await page.getByRole("link",{name:"PlaywrightPractice"}).click();
    await page.getByRole("checkbox", { name: "Accept Terms" }).check();
    await page.getByRole("textbox", { name: "Username" }).fill("Ishwar");

    await page.getByTestId("login-button").click(); //when you have HTMP like - <button data-testid="login-button">Login</button>
    //To get the locator for mainly Image type
    await page.getByAltText("Company Logo").click();

  //If 2 OR more than 2 loctors are matching then we can use as below as well
await page.locator("//input[@type='radio']").last();
await page.locator("//input[@type='radio']").first();

//Playwright Architexture
/*
Total Three components
1.Client- Automation script
2.Playwright Server
3.Browser engines- Chromium, webkit etc

Our Automation script will commuicate with the Playwright server via websocket connection/Protocol
And then Playwright server will convert this code into command using CDP protocoal then sens to browsers
-As it is using WenSocket connection hence in playwriht, Execution speeed is higher than the Selenium

*/


//Auto-retrying assertions //Hard assertion
await expect(locator).toBeVisible();
await expect(locator).toBeHidden();
await expect(locator).toBeEnabled();
await expect(locator).toBeDisabled();
await expect(locator).toHaveText("Login");
await expect(locator).toContainText("Login");
await expect(locator).toHaveValue("Ishwar");
await expect(locator).toBeChecked();
await expect(locator).toHaveAttribute("id", "login-button");
await expect(locator).toHaveCount(5);

//Wait for Load state
await page.waitForLoadState('load');
await page.waitForLoadState('domcontentloaded');
await page.waitForLoadState('networkidle');

//Soft assertion
await expect.soft(locator).toBeVisible();

//Below are page level
await expect(page).toHaveTitle("Home Page");
await expect(page).toHaveURL("https://example.com/home");

//For Negative matcher we can use not
await expect(page).not.toHaveTitle("Swag Labs");

//playwright.config.js file
//We can retries if any test cases is failing
  retries: 1,

//To Get the All text of links which are available on the web page
const allLinks=await page.locator("//a").all();

for(const links of allLinks)
{
   const alltext=await links.innerText();  //OR  const alltext=await links.textContent();
   console.log(alltext);
 } 

=======================x================================================

//DropDown Handle
const dropDown = await page.locator("//select[@id='dropdown-class-example']");
await dropDown.selectOption({label:"Option1"}); //Select by label
await dropDown.selectOption("Option2"); //select by Value
await dropDown.selectOption({index:3}); //select by index

//If Dropdown is multip Options
await dropDown.selectOption([
    'java',
    'playwright',
    'api'
]);

//To Get All Dropdown Option text
const allText=await page.locator("//select[@id='dropdown-class-example']/option").allInnerTexts();
for(const drpText of allText){
     console.log(drpText);
 }

//To Verify particulatr test with the In build assertion
await page.goto("https://exmple.com");
const PageTitle=await page.getByText("Practice Page");
await expect(PageTitle).toBeVisible();

//To Handle Alert -> dialog is an event and page.on is a method-> ans we can handle popup with dialog event
page.on("dialog", async dialog => {
console.log(dialog.message());
await dialog.accept();
await dialog.dismiss();    
})

await page.getByText("Confirm").click();

//To Check all Checkboxes
const allCheckbox=await page.locator("//div[@id='checkbox-example']/descendant::label");
const checkCount=await allCheckbox.count();

for(let i=0; i<checkCount; i++)
 {
     await allCheckbox.nth(i).click();
     console.log("Checked all checkbox");
 }

//WaitFor
const loader = page.locator("#loading-spinner");

// Wait until the loading spinner disappears
await loader.waitFor({ state: "hidden" });
// Wait until the element is visible
await loader.waitFor({ state: "visible" });

// Wait until the element is attached to the DOM
await loader.waitFor({ state: "attached" });

// Wait until the element is detached from the DOM
await loader.waitFor({ state: "detached" });


//To Handle Multiple Window
//Promise.all() returns an array of results.
//const result = await Promise.all([promise1,promise2]); //Output->[resultOfPromise1, resultOfPromise2]
//JavaScript lets us use array destructuring: [newPage] -> Take the first value from the returned array and store it in newPage.

const [newPage]=await Promise.all([
page.waitForEvent("popup"), //here No need to use await as it is in the Promise.All
page.getByText("Open Window").click(),
]);

await newPage.bringToFront();
const pageTitle= await newPage.title();
console.log(pageTitle);
await newPage.close();
await page.bringToFront();  //Back to the main page
console.log(await page.title());

//If Multiple Windows are open the How to Naviagte to perticular window
test("Multiple window handle", async ({page,context})=> {
 
await page.goto("https://rahulshettyacademy.com/AutomationPractice/");
const pages = context.pages();
for (const p of pages) {
    const pageTitle = await p.title();

    if (pageTitle === "Mobile Page") {
        await p.bringToFront();
        console.log("We are in the correct page: " + pageTitle);
       break;
    }
}

//To Get the Count of Web Table Header Row
const headers=await page.locator("//table[@id='product' and @name='courses']/tbody/tr/th");
const count=await headers.count();
console.log(count);

for(let i=0; i<count; i++)
  {
     console.log(await headers.nth(i).innerText());
  }

//Frame Handling
const frameLocator=page.frameLocator("//iframe[@id='courses-iframe']");
await frameLocator.locator("//a[text()='Courses']").first().click();
await expect(frameLocator.getByText("Browse products"));

//Drag and Drop
const drgEle=await page.locator("//div[@id='draggable']");
const dropEle=await page.locator("//div[@id='droppable']");
await drgEle.dragTo(dropEle);
expect(await page.getByText("Dropped!")).toBeVisible();
//Other Mouse operations
await buttonRight.click({button:"right"});
await buttonRight.dblclick();     

//File Upload- Single File
const fileUpload =await page.locator("//input[@id='singleFileInput']");
await fileUpload.setInputFiles("D:\\AutomationTestdata\\SampleScreenShot1.png");
//NOTE- setInputFiles method will work only when we have atribute as type=file     

//File Upload - Multiple files
    const multipleFile=await page.locator("//input[@id='multipleFilesInput']");
    await multipleFile.scrollIntoViewIfNeeded();
    await multipleFile.setInputFiles([
      "D:\\AutomationTestdata\\SampleScreenShot1.png",  //We are passing file in array
      "D:\\AutomationTestdata\\imageNo1.png"
    ]);

 //File Download
 const [download] = await Promise.all([
    page.waitForEvent("download"),
    page.getByText("Download").click()
]);

await download.saveAs("C:\\Downloads\\file.pdf");     

//To Get All Cell Values from Web Table
await page.goto("https://testautomationpractice.blogspot.com/");
const allCellValues= await page.locator("//table[@name='BookTable']/tbody/tr/td");
const allCellCount=await allCellValues.count();
console.log(allCellCount);

for(let i=0; i<allCellCount; i++)
    {
        const textCell=await allCellValues.nth(i).innerText();
        await console.log(textCell);
    }

 //Scrolling 
 await page.evaluate(() => window.scrollBy(0, 500)) //By distance
 await page.evaluate(() => window.scrollTo(0, document.body.scrollHeight)); //Go to the bottom     
============================x===========================x==========================================

//Run the specific test cases using Tag 
test("Mytest1 @sanity", async({page})=> {
 console.log("My test 1 with sanity tag");

})

test("test2npx @regression", async({page})=> {
   console.log("My test 2 with Regression tag");
})

//Mulitple tagging allowed
test('Login functionality @smoke @regression', async ({ page }) => {
    // test steps
});

//terminal commad
npx playwright test --grep "@sanity"

//To Exclude the test case
npx playwright test --grep-invert @regression
//We can use like this as well
npx playwright test --grep "@sanity" --grep-invert "@smoke"    

//Playwriht annotations
//To Skip the test case
test.skip("Mytest1 @sanity", async({page})=> {
 console.log("My test 1 with sanity tag");  
})

//To Run the particular test case
test.only("Mytest1 @sanity", async({page})=> {
 console.log("My test 1 with sanity tag");
})

//Q- How to set action timeout globally?
// In config file, we can add action timeout
export default defineConfig({
  use: {
    // Maximum time each action can take (e.g., 10 seconds)
    actionTimeout: 10 * 1000, 
  },
});

//For step level also we can add like this- IF this click is taking time more than exepcted then we can provide timeout like this
await page.locator("//input[@id='login-button']").click({timeout:10000});

========================x=========================x============================================
//Playwright with POM and test Implementation
//Page Class
import {test,expect} from "@playwright/test"

class TestLoginPage{

constructor(page){
  this.page=page;
  this.usernameInput= page.locator("#username");
  this.passwordInput=page.locator("//input[@id='password']");
  this.submitButton= page.getByRole("button", {name:"Submit"})
  this.pageTitle=page.getByText("Logged In Successfully");
}

async gotoLogin(){
    await this.page.goto("https://practicetestautomation.com/practice-test-login/");
}

async loginToApp(username,password){
  await this.usernameInput.fill(username);
  await this.passwordInput.fill(password);
  await this.submitButton.click();
}

async verifyPageTitle(){
await expect(await this.pageTitle).toBeVisible();
}

}

module.exports = {TestLoginPage};

//test Fuction class
import {test,expect} from "@playwright/test"

import { TestLoginPage } from "../pageObject/TestLoginPage"

test("Login test", async({page})=> {

    const loginPage = new TestLoginPage(page);
    await loginPage.gotoLogin();
    await loginPage.loginToApp("student","Password123");
    await loginPage.verifyPageTitle();
})

//Same test Login- with Data driven testing by readig test data from JSON file
import {test,expect} from "@playwright/test"
import { TestLoginPage } from "../pageObject/TestLoginPage"
import loginTestData from "../DataDrivenTestData/loginTestData.json";

test("Login test", async({page})=> {
    const loginPage = new TestLoginPage(page);
    await loginPage.gotoLogin();
    //BY Using loginTestData file name- We can access the key so that will get the value from json
    await loginPage.loginToApp(loginTestData.username,loginTestData.password);  
    await loginPage.verifyPageTitle();
})

========================x==============================x=========================x===================================

//Login Fixture
import{test as base} from "@playwright/test"

export const test = base.extend({
  loginPage: async ({ page }, use) => {

    await page.goto('https://www.saucedemo.com/');
    await page.getByPlaceholder("Username").fill("standard_user");
    await page.getByPlaceholder("Password").fill("secret_sauce");
    await page.getByText("Login").click();
    await use(page);
  }

})

export { expect } from '@playwright/test';  
//.extend() = used to add a custom fixture
// loginPage -> This is the name of our custom fixture.
// loginPage: async ({ page }, use)  => this line is nothing but an object as before we have curly braces
//use is the function parameter- use is a function that provides the prepared fixture to the test.
=================x==============================x==========================x=========

 //How to cal Login Fixture in test file
import { test, expect } from "../myFixture/loginFixture.js"

test("Login Test with Fixture use", async({loginPage})=> {
    await expect(loginPage).toHaveTitle("Swag Labs");
})

===============x=============================x====================
/*
what is storageState in Playwright?
-storageState is the feature which is provided by Playwright itself and which is used to reuse the browser authentication state.
So here instead of login for each test cases, will login once and will store the browser authentication state in the json file and 
Will reuse the same storage state for the all test cases which will reduce the execution time drastically. */

//Create a setup test:  
import { test } from '@playwright/test';
test('Login and save state', async ({ page }) => {

    await page.goto('https://example.com/login');
    await page.fill('#username', 'admin');
    await page.fill('#password', 'password');
    await page.click('#login');
    await page.context().storageState({
        path: 'auth.json'
    });
});

//After successful login, Playwright creates:auth.json- It constains cookies and session data
//In playwright.config.js:
import { defineConfig } from '@playwright/test';
export default defineConfig({
    use: {
        storageState: 'auth.json'
    }
});

//Keyboard actions
await page.keyboard.press("Tab");
await page.keyboard.press("Escape");
await page.keyboard.press("ArrowDown");
await page.keyboard.press("ArrowUp");
await page.keyboard.press("Backspace");     
await page.keyboard.press("Control+A");

//Errors In Playwright
/*
1.Strict Mode Violation- When locator is matching with the multiple elements
2.TimeoutError -> An operation does not complete within the specified timeout.
3.Navigation timeout -> Navigation does not complete within the configured timeout.
4.Assertion error - > An expected condition does not match the actual result.
*/
//Handle with Try and Catch error
test('Handle exception', async ({ page }) => {
  try {
    await page.goto('https://www.saucedemo.com/');

    await page.locator('#invalidButton').click({
      timeout: 3000
    });

  } catch (error) {
    console.log('Error occurred:', error.message);
  }
});

//Q-Where you are maintaining your Sensible data such as App URL, Username and password?
// WE are creating .env file and there we are maintaining app URL, username and password
//sample .evn file-> We have install .dotenv package
BASE_URL=https://www.saucedemo.com/
USERNAME=standard_user
PASSWORD=secret_sauce
//Under Play config file we have added baseURL like this
  use: {
    baseURL: process.env.BASE_URL
  }

//We are accessing in test file like below
test("@EnvFile Login test with Env data", async ({page})=> {

    await page.goto(process.env.BASE_URL);
    await page.getByPlaceholder("Username").fill(process.env.USERNAME);
    await page.getByPlaceholder("Password").fill(process.env.PASSWORD);
    await page.getByRole("button", {name:"Login"}).click();
})

     






/*--Challenges in Playwright Frameowrk
1.Handle Dynmic element
2.handle Flacky test cases
3.Test Data Conflict/management


//Q- How to Run test cases in multiple Environment such as Dev, QA staging?
//For this we need to install dotEnv packages (That will be added under the dependecny package.json)
//After that will create the .env files such as .env.dev, .env.qa and there will provide the URL, Username, pass etc
//And then in config file, will add the function as define under that will provide the file path with process.env.TEST_ENV


   

     

//VS code commands for Playwright js
//To Check the HTML report       
npx playwright show-report

//To Run the all test cases from test folder
npx playwright test

//To Run the sepecific test
npx playwright test HomePageTest.spec.js

//To run the test cases and run to create allure report
npx playwright test --grep "@smoke" --reporter=line,allure-playwright
npx allure generate ./allure-results --clean  //To generate the allure report
npx allure open ./allure-report  //To open the Allure report

npx playwright test --workers=4  //when we say 4, and if we use chrome, then it will run the test cases in the 4 browser instance(Not Tab/window)
npx playwright test --debug 
npx playwright test --headed
npx playwright test --project=chromium
npx playwright test --retries=2
npx playwright test --last-failed
npx playwright codegen websiteURL   //To generate the script
npx playwright test --grep "@smoke"
npx playwright test JS_Practice.spec.js --project=chromium --headed  //we can use like this as well
npx playwright test --ui  //This will open Playwright test Runner OR UI test runner where we can run and see the test execution such as screenshot, execution details



//Playwright JS Interview Quetions
/*
Q-What is a locator in Playwright?
-> A locator is used to identify and interact with elements on a webpage.

Q- Selenium VS Playwright Diff // Playwright advantages
1.Playwright support UI as well as API testing support
2.Auto Wait Mechanisam
3.Playwright provide User facing locator which are more reliable than xpath/CSS - getByRole, getByText, getByPlaceholder
4. In Build assertion provided by Playwright
5.In built Parallel testing and Retries we can achieve
6.Easy to debug failed test cases using trace view feature
7.Codegen to generate the script from UI


-> await only need to use when you perform some action
 const dropdown= page.locator("#country");  //here you are storing the element only hence Not required. But if you used still
 it will work

Q-What is the difference between locator() and getByRole()?
-> locator() can use CSS/XPath selectors.
->getByRole-> identifies elements based on their accessible role.

Q-Diff between package.json and package-lock.json?
-> package.json defines project dependencies and scripts,
while package-lock.json locks the exact dependency versions installed in the project.




Q-What is auto-waiting in Playwright?
-> Playwright automatically waits for an element to become actionable before performing actions such as click, fill, or check.

Q-How do you launch a browser?
import {test,expect} from "@playwright/test";
test("Launch Browser app",async ({page})=> {
   await page.goto("https://google.com");
})

Q-Write the Login Scenario
-> test("Login to app",async ({page})=> {
   
   await page.goto("https://example.com");
   await page.getByPlaceholder("Enter username").fill("testUser");
   await page.getByPlaceholder("Enter Password").fill("testpass");
   await page.getByText("Login").click();
   await expect(page).toHaveTitle("HomePage"); //Validation for page
})

 //By DEfault timeout is 5 seconds for expect assertion- means it will wait for 5 sec and if not then it will fail    


   Q-How do you handle iframes?
   -> const frame = page.frameLocator("#courses-iframe");
      await frame.getByText("Courses").click();

   Q- How to handle Blinking link/Element?
   -> const binkLink = await page.locator("//a[contains(text(),'help you prepare for your next QA job')]");
      await expect(binkLink).toHaveAttribute("class","blinkingText");  //Blinking element should have always some attribute value

  Q-How do you handle multiple iframes?
   -> const innerFrame = page.frameLocator("#outer-frame").frameLocator("#inner-frame");
      await innerFrame.getByText("Inner Frame Element").click();

  -> We Have 3 types of promises-> Pending, Rejected, Fullfilled    

  Q-What are fixtures in Playwright?
  -> Fixture is a reusable setup which provide the required environment or setup wich is required for the test
  -> page, browser, context, request

  Q-How do you take a screenshot?
  -> await page.screenshot({
    path: "fullpage.png",
    fullPage: true  //This is optional if we dont pass this param it will capture the normal screenshot
});

Q-How do you record video?
-> In playwright.config.js file we can add the following
use: {
    video: 'on'
}

Q-What is the difference between expect() and normal JavaScript assertions?
->Playwright's expect() provides auto-retrying assertions.

Q- How to Install Playwright?
-> npm init playwright@latest


Q-How do you execute tests in parallel?
-> We can add the worked value in the config.js file workers: 4

Q-How do you retry failed tests?
->retries: 2 

Q-How do you run a specific test?
-> by using - npx playwright test login.spec.js

Q-How do you run tests in headed mode?
-> npx playwright test -headed
-> Playwright Test runs in headless mode by default. 
We can run it in headed mode using --headed or configure headless: false in the Playwright configuration.

Q-How do you run tests in a specific browser?
-> npx playwright test --project=chromium

Q-How do you debug Playwright tests?
-> npx playwright test --debug OR you can use -> await page.pause();
-> when we run above command, It will open one playwright inspector, from there we can run step over for each step

Q-How would you design a Playwright framework?
-> I would create a scalable framework using Playwright Test with Page Object Model. 
I would maintain separate folders for pages, tests, utilities, test data and configuration.
I would implement reusable fixtures, environment configuration, reporting, screenshots/traces on failure, retries and parallel execution.
I would integrate the framework with Git and CI/CD tools such as Jenkins or GitHub Actions.
PlaywrightProject
│
├── tests
├── pages
├── fixtures
├── utils
├── test-data
├── playwright.config.js
├── package.json
└── reports

Q-How do you handle flaky tests?
-> Flaky test case- The test cases which get passing sometime and getting failed sometime
First to  verify the flacky test case, i will execute same test case multiple time using command as below
npx playwright test tests/Login.spec.js --repeat-each=3 (It will execute same test cases to check the flackyness)
After checking falckyness- will use the approch like
1.Will add the retries to rerun the failed test case for the specific NUmber of time
2.Will try to use stable locator such as getByRole, getBytext etc instead of using fragile locator such as xpath/CSS
3.Will try to make each test case should be independent (Give example how if test cases are dependent then how it is faling
     if in test case1 we are creating something and using the same created data in test2, if testcase1 is falied then ultimetaly 
     test case 2 will be failed )

     
First, I identify the root cause instead of simply adding waits.
I check locator stability, synchronization issues, network dependency, test-data problems and environment issues. 
I use Playwright's auto-waiting and retrying assertions, stable locators, proper fixtures and controlled retries.
I also use trace, screenshot and video to investigate failures.

Q-How do you explain your Playwright framework in an interview?
-> "I have worked with Playwright using JavaScript and Playwright Test. 
I follow Page Object Model to maintain locators and reusable actions separately from test cases. 
I use stable locators such as getByRole, getByLabel and getByTestId. 
I use Playwright's auto-waiting and auto-retrying assertions instead of unnecessary hard waits. 
I have worked with frames, popups, multiple pages, file uploads, dialogs, dropdowns, API testing and network interception. 
I also use fixtures, retries, parallel execution, screenshots, tracing and CI/CD integration."

Q- Build tool for Playwright test javascript projtect
-> Playwright JavaScript, we use npm/npx and package.json for dependency and project management

Q-How do you run last failed test cases?
-> npx playwright test --last-failed

Q-Hooks In Playwright
-> In Playwright, hooks are special functions that run automatically before or after tests. 
 They are mainly used for setup and cleanup.
 -beforeEach -> Will run before every test- Used for setup code
 after each -> will run after every test - used for teardown/claenup code
 BeforeAll-> Once before all test
 AfterAl-> Once after all test

 test.beforeEach(async ({ page }) => {
    await page.goto("https://example.com");
});

test.afterEach(async({page}) => {
  await page.close();
  console.log("After each block executed");

})

test("Test 1", async ({ page }) => {
    console.log("Test 1");
});

test("Test 2", async ({ page }) => {
    console.log("Test 2");
});

===================================x=========================================x=====================
Q-Grouping of test cases
test.describe("@smoke", () => {
    test("Valid Login", async ({ page }) => {});
    test("Invalid Login", async ({ page }) => {});
}); 

run through terminal
npx playwright test -grep "@smoke"

Q- How to do tagging?
test("Asserion Practice @smoke", async({page})=>{
We can run thar test cases using - npx playwright test --grep "@smoke"

Q-What is Trace Viewer in Playwright?
-> "Playwright Trace Viewer is a debugging feature that records the complete execution details of a test.
It provides a timeline of actions along with screenshots, DOM snapshots, network requests, console logs, and errors.
We can use it to identify exactly where and why a test failed.
We can enable it using the trace option in playwright.config.js and open the generated trace using npx playwright show-trace trace.zip."
Undr config file we can add property as - trace: 'retain-on-failure'
-It Is showing Before and After action as well

Q-What is the default time in Playwright?
-> "Playwright Test has a default test timeout of 30 seconds and a default expect assertion timeout of 5 seconds.
Action and navigation timeouts are 0 by default, meaning no separate timeout is configured for them."

Q-What is package.json?
it is mainly used to manage dependencies, project information, and test commands/scripts.

Q-Build tool in Playwright JS is -> npm- Node package manager

Q- What waitForEvent() will return?
     -> It will wait until the event get occured
     -> It will return the promise

Q-Which reports you have used in Playwright framework?
-> We have used in build Report - HTML report

If we have multiple file under test folder, then all test files will run Parallely
And If we have 2-3 test under one test file, then those test will run sequentially

Q-To Check the Playwriht test report
-> Will have Playwright-report folder->index.html-> copy Path-> open in the browser
  and To view the tracee result, we have another folder as test-results

Q- How to run .js file?
-> file name is testSameple.js
-> node pages/testSample.js  //provide full path from folder

Q- How to read Handle/Read OTP in playwright?
-> we can read the OTP from Database, fro API
If OTP is received through email or SMS, I integrate with an authorized test mailbox or SMS service to retrieve it dynamically.

Q- What is MCP?
-> Model Context Protocol
Playwright MCP (Model Context Protocol) is a tool which allows AI assistants like GitHub Copilot or Claude to interact with browsers using Playwright
It will help AI to perform the actions such as Opening browser, Perform diff actions such as click, enter text and Perform validation

   
    


*/

     





