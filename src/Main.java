import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/orikerbis/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.get("https://www.wikipedia.org/");
        String title = driver.getTitle();
        String URL = driver.getCurrentUrl();
        if (title.equals("Wikipedia")){
            System.out.println("MATCH");
        }
        else {
            System.out.println("NOT MATCH");
        }
        if (URL.equals("https://www.wikipedia.org/")){
            System.out.println("URL MATCH");
        }
        else {
            System.out.println("URL DONT MATCH");
        }
        String mySource = driver.getPageSource();
        if (mySource.contains("portal/wikipedia.org/assets/img/Wikipedia-logo-v2.png")){
            System.out.println("contains");
        }
        else {
            System.out.println("not contains");
        }
        driver.quit();



    }
}