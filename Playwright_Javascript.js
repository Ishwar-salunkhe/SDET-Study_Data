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
    //GetByRole Locator
    await page.getByRole('button', { name: 'Sign in' }).click();
