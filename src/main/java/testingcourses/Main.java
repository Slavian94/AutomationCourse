package testingcourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        browser.manage().window().maximize();

        QaCoursesPage qaPage = new QaCoursesPage(browser);

        qaPage.getOpportunities();
        qaPage.getCourses();
        qaPage.getAdditionalCourses();
        qaPage.goToCategory("Programming");

        Thread.sleep(3000);
        browser.quit();
    }
}
