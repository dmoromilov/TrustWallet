package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.SetupPasscodePage;

public class T03 extends AndroidDriverManager {
  @Test
  public void testSetupPasscodePage(){
    SetupPasscodePage setupPasscodePage = new SetupPasscodePage(this);
    setupPasscodePage.clickNewWalletBTN();
    setupPasscodePage.fingerSwapFromLeftToRight(androidDriver, 2000);
    setupPasscodePage.clickNewWalletBTN();
    setupPasscodePage.clickPrivacyLinkBTN();
    setupPasscodePage.closeBTN();
    setupPasscodePage.clickTermsLinkBTN();
    setupPasscodePage.closeBTN();
    setupPasscodePage.clickCheckBoxBTN();
    setupPasscodePage.clickContinueBTN();

    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();

    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber2();
    setupPasscodePage.checkErrorMessage();

    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.fingerSwapFromLeftToRight(androidDriver, 2000);

    setupPasscodePage.clickNewWalletBTN();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();
    setupPasscodePage.clickNumber1();

  }
}
