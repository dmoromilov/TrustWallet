package pagesAndroid;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {
  private AndroidDriver androidDriver;
  private WebDriverWait driverWait;

  public WelcomePage(AndroidDriverManager driver) {
    this.androidDriver = driver.getAndroidDriver();
    this.driverWait = driver.getDriverWait();
    PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
  }

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/new_account_action")
  private WebElement createNewWalletBTN;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/import_account_action")
  private WebElement importWalletBTN;

  public void backBTN(){
    androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    System.out.println("[BACK] button is clicked");
  }
  public void clickNewWalletBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/new_account_action")));
    createNewWalletBTN.click();
    System.out.println("[CREATE A NEW WALLET] button is clickable");
  }

  public void clickImportWalletBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/import_account_action")));
    importWalletBTN.click();
    System.out.println("[I already have a wallet] button is clickable");
  }


}
