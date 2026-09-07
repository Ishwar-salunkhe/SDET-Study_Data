import {test} from "@playwright/test"

test("Practice of locator method", async({page})=>{
     await page.goto("https://www.saucedemo.com/");
     await page.locator("//input[@id='user-name']").fill("standard_user");
     await page.locator("//input[@id='password']").fill("secret_sauce");
     await page.locator("//input[@id='login-button']").click();
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
