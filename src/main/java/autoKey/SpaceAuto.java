package autoKey;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpaceAuto {


public void autoKey()
{
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http://the-internet.herokuapp.com/key_presses");
   // driver.findElement(id="content").sendKeys();
    //driver.findElement(By.id("target")).sendKeys("JothiShankar");
    driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
    driver.findElement(By.id("target")).sendKeys(Keys.ALT);
    driver.manage().deleteAllCookies();



}


    public static void main(String[] args)
            {
SpaceAuto spaceAuto=new SpaceAuto();
spaceAuto.autoKey();

    }
}
