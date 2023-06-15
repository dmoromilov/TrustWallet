package pagesAndroid;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class WalletRecovery {
  private AndroidDriver androidDriver;
  private WebDriverWait driverWait;

  public WalletRecovery(AndroidDriverManager driver) {
    this.androidDriver = driver.getAndroidDriver();
    this.driverWait = driver.getDriverWait();
    PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
  }

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/new_account_action")
  private WebElement createNewWalletBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/import_account_action")
  private WebElement importWalletBTN;

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

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[2]")
  private WebElement phrase1;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[2]")
  private WebElement phrase2;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]")
  private WebElement phrase3;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.TextView[2]")
  private WebElement phrase4;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.TextView[2]")
  private WebElement phrase5;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[6]/android.widget.TextView[2]")
  private WebElement phrase6;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[7]/android.widget.TextView[2]")
  private WebElement phrase7;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[8]/android.widget.TextView[2]")
  private WebElement phrase8;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[9]/android.widget.TextView[2]")
  private WebElement phrase9;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[10]/android.widget.TextView[2]")
  private WebElement phrase10;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[11]/android.widget.TextView[2]")
  private WebElement phrase11;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[12]/android.widget.TextView[2]")
  private WebElement phrase12;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
  private WebElement phraseVerify1;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")
  private WebElement phraseVerify2;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView")
  private WebElement phraseVerify3;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.TextView")
  private WebElement phraseVerify4;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.TextView")
  private WebElement phraseVerify5;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[6]/android.widget.TextView")
  private WebElement phraseVerify6;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[7]/android.widget.TextView")
  private WebElement phraseVerify7;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[8]/android.widget.TextView")
  private WebElement phraseVerify8;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[9]/android.widget.TextView")
  private WebElement phraseVerify9;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[10]/android.widget.TextView")
  private WebElement phraseVerify10;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[11]/android.widget.TextView")
  private WebElement phraseVerify11;
  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[12]/android.widget.TextView")
  private WebElement phraseVerify12;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_verify")
  private WebElement nextPhraseBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/message")
  private WebElement wellDoneMessage;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_done")
  private WebElement doneBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_copy")
  private WebElement copyWords;

  @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View")
  private WebElement skipBars;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_cancel")
  private WebElement cancelNotifications;

  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/graph_settings")
  private WebElement settingsBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wallets')]")
  private WebElement walletsBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/item_wallet_info_action")
  private WebElement walletInfoBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_add")
  private WebElement deleteBinWalletBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Delete')]")
  private WebElement deleteBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Proceed anyway')]")
  private WebElement proceedBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Multi-Coin Wallet')]")
  private WebElement restoreMultiCoinBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_paste")
  private WebElement actionPasteBTN;
  @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/action_import")
  private WebElement importBTN;
  @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Main Wallet 1')]")
  private WebElement checkWalletText;

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
  public void clickImportWalletBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/import_account_action")));
    importWalletBTN.click();
    System.out.println("[I already have a wallet] button is clickable");
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

  public void clickDoneBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/action_done")));
    doneBTN.click();
    System.out.println("[DONE] button is clickable");
  }

  public void clickSkipBars(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View")));
    skipBars.click();
    System.out.println("[SKIP BARS]");

  }

  public void clickCancelNotifications(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/action_cancel")));
    cancelNotifications.click();
    System.out.println("[X]button on popup");
  }

  public void clickSettingsBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/graph_settings")));
    settingsBTN.click();
    System.out.println("[Settings] button is clickable");
  }

  public void clickWalletsBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Wallets')]")));
    walletsBTN.click();
    System.out.println("[Wallets] button is clickable");
  }

  public void clickWalletInfoBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/item_wallet_info_action")));
    walletInfoBTN.click();
    System.out.println("[...] button is clickable");
  }
  public void clickBinWalletBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/action_add")));
    deleteBinWalletBTN.click();
    System.out.println("[BIN] button is clickable");
  }
  public void clickDeleteBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Delete')]")));
    deleteBTN.click();
    System.out.println("[DELETE] button is clickable");
  }
  public void clickProceedBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Proceed anyway')]")));
    proceedBTN.click();
  }
  public void clickMultiCoinBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Multi-Coin Wallet')]")));
    restoreMultiCoinBTN.click();
    System.out.println("[Multi-Coin Wallet] button is clickable");
  }
  public void clickPastBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/action_paste")));
    actionPasteBTN.click();
    System.out.println("[PAST Phrase] button is clickable");
  }
  public void clickImportBTN(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wallet.crypto.trustapp:id/action_import")));
    importBTN.click();
    System.out.println("[IMPORT] button is clickable");
  }

  public void checkWalletAdded(){
    driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Main Wallet 1')]")));
    String walletText = checkWalletText.getText();
    System.out.println("Wallet Text: " + walletText);
    Assert.assertEquals(walletText, "Main Wallet 1");
  }

  public void getTextAndVerifyPhrase() {
    String[] array1 = getTextFromPage1();
    navigateToPage2();
    String[] array2 = getTextFromPage2();

    System.out.println("Before rearrangement:");
    System.out.println("Array1: " + Arrays.toString(array1));
    System.out.println("Array2: " + Arrays.toString(array2));

    rearrangeArray(array1, array2);

    System.out.println("After rearrangement:");
    System.out.println("Array1: " + Arrays.toString(array1));
    System.out.println("Array2: " + Arrays.toString(array2));

    clickElementsInSortedOrder(array2);
//    Assert.assertEquals(wellDoneMessage.getText(),"Well done!");
  }

  public String[] getTextFromPage1() {
    String word1 = phrase1.getText();
    String word2 = phrase2.getText();
    String word3 = phrase3.getText();
    String word4 = phrase4.getText();
    String word5 = phrase5.getText();
    String word6 = phrase6.getText();
    String word7 = phrase7.getText();
    String word8 = phrase8.getText();
    String word9 = phrase9.getText();
    String word10 = phrase10.getText();
    String word11 = phrase11.getText();
    String word12 = phrase12.getText();

    return new String[]{word1, word2, word3, word4, word5, word6, word7, word8, word9, word10, word11, word12};
  }

  public void navigateToPage2() {
    // Perform necessary actions to navigate to page 2
    copyWords.click();
    try {
      Thread.sleep(10000);
      nextPhraseBTN.click();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public String[] getTextFromPage2() {
    String wordVerify1 = phraseVerify1.getText();
    String wordVerify2 = phraseVerify2.getText();
    String wordVerify3 = phraseVerify3.getText();
    String wordVerify4 = phraseVerify4.getText();
    String wordVerify5 = phraseVerify5.getText();
    String wordVerify6 = phraseVerify6.getText();
    String wordVerify7 = phraseVerify7.getText();
    String wordVerify8 = phraseVerify8.getText();
    String wordVerify9 = phraseVerify9.getText();
    String wordVerify10 = phraseVerify10.getText();
    String wordVerify11 = phraseVerify11.getText();
    String wordVerify12 = phraseVerify12.getText();

    return new String[]{wordVerify1, wordVerify2, wordVerify3, wordVerify4, wordVerify5, wordVerify6, wordVerify7,
        wordVerify8, wordVerify9, wordVerify10, wordVerify11, wordVerify12};
  }

  public void clickElementsInSortedOrder(String[] array2) {
    for (String element : array2) {
      WebElement elementToClick = findElementByText(element);
      if (elementToClick != null) {
        elementToClick.click();
      }
    }
  }

  private WebElement findElementByText(String text) {
    List<WebElement> elements = androidDriver.findElements(By.xpath("//android.widget.TextView[contains(@text, '" + text + "')]"));
    return elements.isEmpty() ? null : elements.get(0);
  }

  private void rearrangeArray(String[] array1, String[] array2) {
    Map<String, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < array1.length; i++) {
      indexMap.put(array1[i], i);
    }
    Arrays.sort(array2, (a, b) -> {
      Integer indexA = indexMap.get(a);
      Integer indexB = indexMap.get(b);
      if (indexA == null || indexB == null) {
        return 0; // Handle null elements
      }
      return indexA - indexB;
    });
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
