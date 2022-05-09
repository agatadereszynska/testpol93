import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        String pageTitle = "";
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        pageTitle = driver.getTitle();

        if (pageTitle.equals("My Store")){
            System.out.println("Test przebiegł pozytywnie");
        } else {
            System.out.println("Coś poszło źle");
        }

    }

}
