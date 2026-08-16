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
