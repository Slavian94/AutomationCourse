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
                By.xpath("//button[@data-dropdown-trigger='coursesMenu']"));
        courseButton.click();

        WebElement programmingButton = browser.findElement(
                By.xpath("//button[@data-category='programming']"));
        programmingButton.click();

        WebElement frontEndBasicButton = browser.findElement(
                By.xpath("//a[@class='course-label -alt' and @href='https://ithillel.ua/courses/front-end-basic']"));
        frontEndBasicButton.click();

        WebElement coachesSection = browser.findElement(By.cssSelector(".-coaches"));
        ((JavascriptExecutor)browser).executeScript("scrollTo(" + coachesSection.getLocation().x +
                "," + coachesSection.getLocation().y + ")");

        WebElement allCoachesButton = browser.findElement(By.id("coachesShowAllButton"));
        allCoachesButton.click();

        List<WebElement> coachNames = browser.findElements(By.className("coach-card_name"));
        List<String> listNames = coachNames.stream().map(WebElement::getText).toList();

        System.out.println(listNames);

        browser.quit();
    }
}
