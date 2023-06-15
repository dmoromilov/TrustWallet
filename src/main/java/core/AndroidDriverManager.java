package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidDriverManager {
  protected static AndroidDriver androidDriver;
  protected static WebDriverWait driverWait;

  private final static String APP = "/Users/dmoromilov/Downloads/v7.24.2_release.apk";
  private final static String APP_PACKAGE_NAME = "com.wallet.crypto.trustapp";
  private final static String APP_ACTIVITY_NAME = "com.wallet.crypto.trustapp.ui.start.activity.RootHostActivity";
  private final static String serverURL = "http://0.0.0.0:4723/wd/hub";

  @BeforeClass
  public static void setup() {
    initDriver();
    driverWait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
  }

  public AndroidDriver getAndroidDriver() {
    return androidDriver;
  }

  public WebDriverWait getDriverWait() {
    return driverWait;
  }

  private static void initDriver() {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro");
    cap.setCapability(MobileCapabilityType.NO_RESET, true);
    cap.setCapability(MobileCapabilityType.APP,APP);
    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);

    try {
      System.out.println("Argument to driver object : " + serverURL);
      androidDriver = new AndroidDriver(new URL(serverURL), cap);
    } catch (NullPointerException | MalformedURLException ex) {
      throw new RuntimeException("Appium driver could not be initialised for device ");
    }
    System.out.println("Driver is : " + androidDriver);
  }

  @AfterClass
  public void teardown() {
    androidDriver.quit();

    // Uninstall the application
    String appPackage = "com.wallet.crypto.trustapp";
    String adbCommand = "adb uninstall " + appPackage;

    try {
      Runtime.getRuntime().exec(adbCommand);
      System.out.println("Uninstalled the application: " + appPackage);
    } catch (IOException e) {
      System.err.println("Failed to uninstall the application: " + appPackage);
      e.printStackTrace();
    }
  }
}
