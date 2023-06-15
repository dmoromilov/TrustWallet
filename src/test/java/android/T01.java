package android;

import org.testng.annotations.Test;

import core.AndroidDriverManager;
import pagesAndroid.WelcomePage;

public class T01 extends AndroidDriverManager {

  @Test
  public void testWelcomePage(){
    WelcomePage welcomePage = new WelcomePage(this);
    welcomePage.clickNewWalletBTN();
    welcomePage.backBTN();
  }
}
