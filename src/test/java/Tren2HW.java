import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tren2HW {
    WebDriver wd;

    @Test
    public void trenHW(){
        wd = new ChromeDriver();
        wd.get("https://kinogo.eu/");

        wd.close();
        wd.quit();
    }

}
