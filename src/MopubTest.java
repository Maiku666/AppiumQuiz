/**
 * Created by mihec on 02/02/2017.
 */
import io.appium.java_client.AppiumDriver;
import org.junit.*;
import org.junit.Assert.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class MopubTest
{
    AppiumDriver drive;

    //Setup
    //Step 1: Start the Mopub test app on an Android mobile device.
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("devicename","MyTestDevice");

        //It works with java-client-4.0.0.jar :)
        drive = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        //Reset the cache!
        drive.resetApp();

    }

    //Breakdown
    //Step 7: Close the Mopub test app when the script is finished.
    @After
    public void tearDown()
    {
        drive.quit();
    }




    @Test
    public void TestScenario()
    {
        WebElement bannerButton = drive.findElement(By.id("com.mopub.simpleadsdemo:id/banner_description"));

        //System.out.println(bannerButton.getLocation());
        //Is banner position ok?
        Assert.assertEquals(bannerButton.getLocation(), new Point(0, 74));

        //Step 2: Tap on the first item in the grid named ‘MoPub Banner Sample
        bannerButton.click();

        //Step 3: Wait for the banner with text ‘Tap to test this ad’ to appear
        WebElement bButton = (new WebDriverWait(drive, 30)).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[1]/android.widget." +
                        "FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget" +
                        ".FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]")));

        //Step 4: Tap on the banner.
        bButton.click();

        //Step 5: Wait for the mobile page with title ‘Drive More Mobile Ad Revenue’ to open.
        WebElement mPageTitle = (new WebDriverWait(drive, 30)).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//android.widget.LinearLayout[1]/android.widget." +
                        "FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit" +
                        ".WebView[1]/android.webkit.WebView[1]/android.view.View[2]")));

        //Check expanded unit
        WebElement exUnit = drive.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget" +
                ".LinearLayout[1]/android.widget.RelativeLayout[1]/android" +
                ".webkit.WebView[1]/android.webkit.WebView[1]"));
        //First we check if it is displayed and then the coordinates
        Assert.assertEquals(exUnit.isDisplayed(), true);
        Assert.assertEquals(exUnit.getLocation(), new Point(0, 0));
        //Find "x"(close) button
        WebElement closeButton = drive.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android" +
                ".widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget" +
                ".LinearLayout[1]/android.widget.ImageButton[4]"));

        //Step 6: Close the page by tapping on the close button (x) in the bottom-right corner.
        closeButton.click();
    }


}
