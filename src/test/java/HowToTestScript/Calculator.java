package HowToTestScript;

import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Calculator {


        static AndroidDriver driver;   //create an instance variable for appium driver
//     static int number1 = 12;
//     static  int number2 = 10;


        @BeforeClass
        public static void setUp() throws MalformedURLException {

            String sessionId;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5");
            capabilities.setCapability("deviceName", "Galaxy Note 3");
            capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
            capabilities.setCapability("appActivity", ".Calculator");

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @AfterClass
        public static void TearDown()
        {
            driver.quit();
        }

        @Test
        public void welcomeText() {
            driver.findElement(By.id("android:id/action_bar_container")).isEnabled();
            driver.findElement(By.id("bt_05")).click();
            driver.findElement(By.id("bt_mul")).click();
            driver.findElement(By.id("bt_06")).click();
            driver.findElementByAccessibilityId("equal").click();

            String result = driver.findElementByClassName("android.widget.EditText").getText();
            assertEquals("5×6\n=30. Editing.", result);
        }

    }
