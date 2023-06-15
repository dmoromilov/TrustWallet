package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.VerifySecretPhrase;

public class T05 extends AndroidDriverManager {
  @Test
  public void testVerifyPhrasePage(){
    VerifySecretPhrase verifySecretPhrase = new VerifySecretPhrase(this);
    verifySecretPhrase.clickNewWalletBTN();
    verifySecretPhrase.fingerSwapFromLeftToRight(androidDriver, 2000);
    verifySecretPhrase.clickNewWalletBTN();
    verifySecretPhrase.clickPrivacyLinkBTN();
    verifySecretPhrase.closeBTN();
    verifySecretPhrase.clickTermsLinkBTN();
    verifySecretPhrase.closeBTN();
    verifySecretPhrase.clickCheckBoxBTN();
    verifySecretPhrase.clickContinueBTN();

    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();

    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();
    verifySecretPhrase.clickNumber1();

    verifySecretPhrase.clickBackUpManuallyBTN();
    verifySecretPhrase.checkBox1();
    verifySecretPhrase.checkBox2();
    verifySecretPhrase.checkBox3();

    verifySecretPhrase.clickContinueBTN();
    verifySecretPhrase.getTextAndVerifyPhrase();
    verifySecretPhrase.clickDoneBTN();

    verifySecretPhrase.clickSkipBars();
    verifySecretPhrase.clickSkipBars();
    verifySecretPhrase.clickSkipBars();
    verifySecretPhrase.clickSkipBars();
    verifySecretPhrase.clickCancelNotifications();
  }
}
