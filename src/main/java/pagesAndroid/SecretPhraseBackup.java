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

public class SecretPhraseBackup {
  private AndroidDriver androidDriver;
  private WebDriverWait driverWait;

  public SecretPhraseBackup(AndroidDriverManager driver) {
    this.androidDriver = driver.getAndroidDriver();
    this.driverWait = driver.getDriverWait();
    PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
  }

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/new_account_action")
  private WebElement createNewWalletBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/privacy")
  private WebElement privacyLinkBTN;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]")
  private WebElement closeBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/terms")
  private WebElement termsLinkBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/acceptCheckBox")
  private WebElement acceptCheckBoxBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/next")
  private WebElement continueBTN;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'1')]")
  private WebElement number1BTN;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Back up manually')]")
  private WebElement backUpManuallyBTN;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Back up later')]")
  private WebElement backUpLaterBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/concent1")
  private WebElement checkBox1;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'If I lose my secret phrase, my funds will be lost forever.')]")
  private WebElement checkBox1Text;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/concent2")
  private WebElement checkBox2;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'If I expose or share my secret phrase to anybody, my funds can get stolen.')]")
  private WebElement checkBox2Text;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/concent3")
  private WebElement checkBox3;

  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Trust Wallet support will NEVER reach out to ask for it')]")
  private WebElement checkBox3Text;

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
  public void clickNumber1() {
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'1')]")));
    number1BTN.click();
    System.out.println("[1] button is clickable");
  }

  public void clickBackUpManuallyBTN() {
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Back up manually')]")));
    backUpManuallyBTN.click();
    System.out.println("[Back up manually] button is clickable");
  }

  public void clickBackUpLaterBTN() {
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Back up later')]")));
    backUpLaterBTN.click();
    System.out.println("[Back up later] button is clickable");
  }

  public void checkBox1(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/concent1")));
    checkBox1.click();
    Assert.assertEquals(checkBox1Text.getText(),"If I lose my secret phrase, my funds will be lost forever.");
    System.out.println("Correct text [If I lose my secret phrase, my funds will be lost forever.] is displayed");
  }

  public void checkBox2(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/concent2")));
    checkBox2.click();
    Assert.assertEquals(checkBox2Text.getText(),"If I expose or share my secret phrase to anybody, my funds can get stolen.");
    System.out.println("Correct text [If I expose or share my secret phrase to anybody, my funds can get stolen.] is displayed");
  }

  public void checkBox3(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/concent3")));
    checkBox3.click();
    Assert.assertEquals(checkBox3Text.getText(),"Trust Wallet support will NEVER reach out to ask for it");
    System.out.println("Correct text [Trust Wallet support will NEVER reach out to ask for it] is displayed");
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
