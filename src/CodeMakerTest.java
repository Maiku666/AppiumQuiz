/*
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class {name} {
	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.1");
		capabilities.setCapability("deviceName", "MyTestDevice");
		capabilities.setCapability("app", "/Users/mihec/Documents/Programming/AppiumTest/apps/mopub_v4.11.0.apk");
		capabilities.setCapability("appPackage", "com.mopub.simpleadsdemo");
		wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
		wd.findElement(By.name(" Success! Tap to test this ad.")).click();
		wd.findElement(By.name(" Success! Tap to test this ad.")).click();
		wd.findElement(By.name(" Success! Tap to test this ad.")).click();
		wd.findElement(By.name("Drive More Mobile Ad Revenue")).click();
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageButton[4]")).click();
		wd.close();
	}
}
*/