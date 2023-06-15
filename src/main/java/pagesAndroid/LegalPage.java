package pagesAndroid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import core.AndroidDriverManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LegalPage {
  private AndroidDriver androidDriver;
  private WebDriverWait driverWait;

  public LegalPage(AndroidDriverManager driver) {
    this.androidDriver = driver.getAndroidDriver();
    this.driverWait = driver.getDriverWait();
    PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
  }

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/new_account_action")
  private WebElement createNewWalletBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/privacy")
  private WebElement privacyLinkBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Trust Wallet Privacy and Policy')]")
  private WebElement privacyCheckText;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]")
  private WebElement closeBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/terms")
  private WebElement termsLinkBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Terms Of Service')]")
  private WebElement termCheckText;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/acceptCheckBox")
  private WebElement acceptCheckBoxBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/next")
  private WebElement continueBTN;

  public void backBTN(){
    androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    System.out.println("[BACK] button is clicked");
  }

  public void closeBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[contains(@index,'1')]")));
    closeBTN.click();
    System.out.println("[X] button is clicked");
  }

  public void clickNewWalletBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/new_account_action")));
    createNewWalletBTN.click();
    System.out.println("[CREATE A NEW WALLET] button is clickable");
  }

  public void clickPrivacyLinkBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/privacy")));
    privacyLinkBTN.click();
    System.out.println("[PRIVACY] button is clickable");
  }

  public void clickTermsLinkBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/terms")));
    termsLinkBTN.click();
    System.out.println("[I already have a wallet] button is clickable");
  }

  public void checkPrivacyText(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Trust Wallet Privacy and Policy')]")));
    String privacyText = privacyCheckText.getText();
    System.out.println("Text: " + privacyText);
    Assert.assertEquals(privacyText, "Trust Wallet Privacy and Policy");
  }

  public void checkTermsText(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Terms Of Service')]")));
    String termsText = termCheckText.getText();
    System.out.println("Text: " + termsText);
    Assert.assertEquals(termsText, "Terms Of Service");
  }

  public void clickCheckBoxBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/acceptCheckBox")));
    acceptCheckBoxBTN.click();
    System.out.println("[CheckBox] button is clickable");
  }

  public void clickContinueBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/next")));
    continueBTN.click();
    System.out.println("[CONTINUE] button is clickable");
  }

  public void fingerSwapFromLeftToRight(AndroidDriver driver, int duration) {
    // Get the screen dimensions
    Dimension size = driver.manage().window().getSize();
    int screenHeight = size.getHeight();
    int screenWidth = size.getWidth();

    // Define the swipe coordinates
    int startx = 0; // Left edge
    int starty = screenHeight / 2; // Middle of the screen
    int endx = screenWidth - 1; // Right edge
    int endy = starty;

    // Perform the finger swap gesture
    TouchAction touchAction = new TouchAction(driver);
    touchAction.press(PointOption.point(startx, starty))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
        .moveTo(PointOption.point(endx, endy))
        .release()
        .perform();
  }

}
