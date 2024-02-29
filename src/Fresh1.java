import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fresh1 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SALAUDEEN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //Taking Sc of a page

        TakesScreenshot Sc = (TakesScreenshot) driver;
        File srcfile = Sc.getScreenshotAs(OutputType.FILE);

        String Timestamp = new SimpleDateFormat("yyyMMdd_hhmms").format(new Date());
        String Filename = "IMG"+Timestamp+".png";

        FileUtils.copyFile(srcfile,new File("C:\\Users\\SALAUDEEN\\Screenshots\\"+Filename));

        //Taking Sc of an element

        Sc = (TakesScreenshot) driver;
        srcfile = Sc.getScreenshotAs(OutputType.FILE);

        Timestamp = new SimpleDateFormat("yyyMMdd_hhmms").format(new Date());
        Filename = "IMG" + Timestamp + ".png";

        FileUtils.copyFile(srcfile,new File("C:\\Users\\SALAUDEEN\\Screenshots\\"+Filename));

        //driver.quit();
    }
}
