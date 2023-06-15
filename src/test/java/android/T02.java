package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.LegalPage;

public class T02 extends AndroidDriverManager {
  @Test
  public void testLegalPage(){
    LegalPage legalPage = new LegalPage(this);
    legalPage.clickNewWalletBTN();
    legalPage.fingerSwapFromLeftToRight(androidDriver, 2000);
    legalPage.clickNewWalletBTN();
    legalPage.clickPrivacyLinkBTN();
    legalPage.checkPrivacyText();
    legalPage.closeBTN();
    legalPage.clickTermsLinkBTN();
    legalPage.checkTermsText();
    legalPage.closeBTN();
  }
}
