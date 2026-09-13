import {test} from "@playwright/test" // It is called module- @playwright/test

test("Login test", async({page})=>{
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

})

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
    await page.getByRole('button', { name: 'Sign in' }).first().click();

//Auto-retrying assertions
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

//To Get All Dropdown Option text
const allText=await page.locator("//select[@id='dropdown-class-example']/option").allInnerTexts();
for(const drpText of allText)
 {
     console.log(drpText);
 }

//To Verify particulatr test with the In build assertion
await page.goto("https://exmple.com");
const PageTitle=await page.getByText("Practice Page");
await expect(PageTitle).toBeVisible();

//To Handle Alert
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

//To Handle Multiple Window
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

//To Get the Count of Web Table Header Row
const headers=await page.locator("//table[@id='product' and @name='courses']/tbody/tr/th");

const count=await headers.count();
console.log(count);

for(let i=0; i<count; i++)
  {
     console.log(await headers.nth(i).innerText());
  }











//VS code commands for Playwright js
//To Check the HTML report       
npx playwright show-report

//To Run the all test cases from test folder
npx playwright test

//To Run the sepecific test
npx playwright test HomePageTest.spec.js






//=====JS Basics ==========X=======================X=======================
//Data Types-> String, Number, Boolean, Undefined, Array, Object, 

//For Loop Pattern
for (let i = 0; i < 5; i++) {
    console.log(i);
}

//Arrays
const fruits = ["Apple", "Mango", "Banana"];
console.log(fruits[1]);
console.log(fruits.length);
fruits.push("Watermelon"); //To Add New Value In Array

//Objects-> Object stores data as key-value pairs.
   const employee={
    name:"Ishwar",
    age:20,
    Address: "Pune"
   }

   console.log(employee.name);

//typeof -> Used to find the data type.





