package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.SecretPhraseBackup;

public class T04 extends AndroidDriverManager {
  @Test
  public void testSecretPhrasePage(){
  SecretPhraseBackup secretPhraseBackup = new SecretPhraseBackup(this);
    secretPhraseBackup.clickNewWalletBTN();
    secretPhraseBackup.fingerSwapFromLeftToRight(androidDriver, 2000);
    secretPhraseBackup.clickNewWalletBTN();
    secretPhraseBackup.clickPrivacyLinkBTN();
    secretPhraseBackup.closeBTN();
    secretPhraseBackup.clickTermsLinkBTN();
    secretPhraseBackup.closeBTN();
    secretPhraseBackup.clickCheckBoxBTN();
    secretPhraseBackup.clickContinueBTN();

    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();

    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();
    secretPhraseBackup.clickNumber1();

    secretPhraseBackup.clickBackUpManuallyBTN();
    secretPhraseBackup.checkBox1();
    secretPhraseBackup.checkBox2();
    secretPhraseBackup.checkBox3();

    secretPhraseBackup.clickContinueBTN();
  }
}
