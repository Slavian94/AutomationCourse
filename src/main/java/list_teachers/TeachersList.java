package list_teachers;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class TeachersList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        browser.manage().window().maximize();

        browser.get("https://ithillel.ua/");

        WebElement courseButton = browser.findElement(
                By.xpath("//*[@id='body']/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button"));
        courseButton.click();

        WebElement programmingButton = browser.findElement(
                By.xpath("//*[@id='coursesMenuControlPanel']/ul/li[2]/button"));
        programmingButton.click();

        WebElement frontEndBasicButton = browser.findElement(
                By.xpath("//*[@id='block-202987']/div/ul/li[1]/a"));
        frontEndBasicButton.click();

        WebElement coachesSection = browser.findElement(By.cssSelector(".-coaches"));
        ((JavascriptExecutor)browser).executeScript("scrollTo(" + coachesSection.getLocation().x +
                "," + coachesSection.getLocation().y + ")");

        WebElement allCoachesButton = browser.findElement(By.id("coachesShowAllButton"));
        allCoachesButton.click();

        List<WebElement> coachNames = browser.findElements(By.className("coach-card_name"));
        List<String> listNames = coachNames.stream().map(WebElement::getText).toList();

        System.out.println(listNames);

        Thread.sleep(2000);
        browser.quit();
    }
// WebElement courseButton = browser.findElement(By.cssSelector("button.site-nav-link[data-dropdown-trigger*='coursesMenu']"));
// WebElement courseButton = browser.findElement(By.xpath("//button[@data-dropdown-trigger = 'coursesMenu']"));
// WebElement contactButton3 = browser.findElement(By.xpath("//button[contains(@data-dropdown-trigger, 'ursesMenu')]"));
}
