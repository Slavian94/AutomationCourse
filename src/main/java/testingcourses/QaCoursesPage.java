package testingcourses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class QaCoursesPage implements NavigationButtons {
    private WebDriver driver;

    private By coursesLocator =
            By.xpath("//*[@class='block-profession_group' and .//*[contains (text(), 'Професія QA')]]");
    private By additionalCoursesLocator =
            By.xpath("//*[@class='block-profession_group' and .//*[contains (text(),'Додаткові курси')]]");
    private By opportunitiesLocator = By.xpath("//ul[@class = 'opportunities_list']");


    public  QaCoursesPage (WebDriver browser) {
        this.driver = browser;
        browser.get(QA_PAGE_URL);
    }
    public List<String> getCourses() {
        WebElement coursesElement = driver.findElement(coursesLocator);
        List<WebElement> coursesList = coursesElement.findElements(By.tagName("li"));

        List<String> coursesTextList = new ArrayList<>();
        for (WebElement course : coursesList) {
            coursesTextList.add(course.getText());
        }
        return coursesTextList;
    }

    public List<String> getAdditionalCourses() {
        WebElement additionalCoursesElement = driver.findElement(additionalCoursesLocator);
        List<WebElement> additionalCoursesList = additionalCoursesElement.findElements(By.tagName("li"));

        List<String> additionalCoursesTextList = new ArrayList<>();
        for (WebElement additionalCourse : additionalCoursesList) {
            additionalCoursesTextList.add(additionalCourse.getText());
        }
        return additionalCoursesTextList;
    }

    public List<String> getOpportunities() {
        WebElement opportunitiesElement = driver.findElement(opportunitiesLocator);
        List<WebElement> opportunitiesList = opportunitiesElement.findElements(By.tagName("li"));

        List <String> opportunitiesTextList = new ArrayList<>();
        for (WebElement opportunity : opportunitiesList) {
            opportunitiesTextList.add(opportunity.getText());
        }
        return opportunitiesTextList;
    }
    public void goToCategory(String category){

        WebElement button = switch (category) {
            case "Programming" -> driver.findElement(By.cssSelector(PROGRAMMING_CSS_SELECTOR));
            case "Testing" -> driver.findElement(By.cssSelector(TESTING_CSS_SELECTOR));
            case "Management" -> driver.findElement(By.cssSelector(MANAGEMENT_CSS_SELECTOR));
            case "Marketing" -> driver.findElement(By.cssSelector(MARKETING_CSS_SELECTOR));
            case "Design" -> driver.findElement(By.cssSelector(DESIGN_CSS_SELECTOR));
            case "Kids" -> driver.findElement(By.cssSelector(KIDS_CSS_SELECTOR));
            default -> throw new IllegalArgumentException("Invalid page name!");
        };
        button.click();
    }
}


