package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.WalletRecovery;

public class T06 extends AndroidDriverManager {
  @Test
  public void testWalletRecovery(){
    WalletRecovery walletRecovery = new WalletRecovery(this);
    walletRecovery.clickNewWalletBTN();
    walletRecovery.fingerSwapFromLeftToRight(androidDriver, 2000);
    walletRecovery.clickNewWalletBTN();
    walletRecovery.clickPrivacyLinkBTN();
    walletRecovery.closeBTN();
    walletRecovery.clickTermsLinkBTN();
    walletRecovery.closeBTN();
    walletRecovery.clickCheckBoxBTN();
    walletRecovery.clickContinueBTN();

    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();

    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();

    walletRecovery.clickBackUpManuallyBTN();
    walletRecovery.checkBox1();
    walletRecovery.checkBox2();
    walletRecovery.checkBox3();

    walletRecovery.clickContinueBTN();
    walletRecovery.getTextAndVerifyPhrase();
    walletRecovery.clickDoneBTN();

    walletRecovery.clickSkipBars();
    walletRecovery.clickSkipBars();
    walletRecovery.clickSkipBars();
    walletRecovery.clickSkipBars();
    walletRecovery.clickCancelNotifications();
    walletRecovery.clickSettingsBTN();
    walletRecovery.clickWalletsBTN();
    walletRecovery.clickWalletInfoBTN();
    walletRecovery.clickBinWalletBTN();
    walletRecovery.clickDeleteBTN();

    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickImportWalletBTN();
    walletRecovery.clickCheckBoxBTN();
    walletRecovery.clickContinueBTN();

    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();

    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();
    walletRecovery.clickNumber1();

    walletRecovery.clickMultiCoinBTN();
    walletRecovery.clickPastBTN();
    walletRecovery.clickImportBTN();
    walletRecovery.checkWalletAdded();
  }
}
