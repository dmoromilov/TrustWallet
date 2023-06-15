# TrustWallet
TrustWallet Task

Test Plan: Flow to Complete Wallet Creation for TrustWallet Android Application

1. Test Objective:
   The objective of this test plan is to verify the functionality and usability of the legal screen flow in the TrustWallet Android app. The legal screen is the initial step in the wallet creation process, where users are presented with legal terms and conditions that they must accept before proceeding.

2. Test Environment:
   - Android emulator (Pixel 6 Pro)
   - Android OS API34 (v14)
   - TrustWallet Android application (latest version)
   - Test accounts for various cryptocurrency networks (e.g., Ethereum, Bitcoin, etc.)
   - Test data (seed phrases, passcode, etc.)

3. Test Scenarios:

   3.1 Initial Setup:
      - Launch the TrustWallet application
      - Verify the welcome screen is displayed with options for creating a new wallet

   3.2 Wallet Creation:
      - Click on "Create a new wallet" button
      - Click on "Privacy Policy" button
      - Verify that the user is present with "Privacy Policy" page
      - Click on [X] button on the top left corner

      - Click on "Terms of Service" button. 
      - Verify that the user is present with "Terms of Service" page
      - Click on [X] button on the top left corner

      - Check box "I've read and accept the Terms of Service and Privacy Policy."
      - Click on "Continue" button

      - Enter a valid passcode (e.g., 111111)
      - Enter an invalid passcode (e.g., 111112)
      - Verify that the user is present with the error message "Those passwords didn’t match!"

      - Enter a valid passcode (e.g., 111111)
      - Click on the "back" button (swape screen from left to right)
      - Verify that the wallet creation process is cancelled, and the user is redirected to the creating a new wallet page

      - Click on "Create a new wallet" button
      - Enter a valid passcode and confirm it (e.g., 111111)
      - Verify that the user is presented with a backup seed phrase

   3.3 Backup Seed Phrase:
   	  -	Click on "Back up manually" button
      - Click on the "back" button (swape screen from left to right)
      - Verify that the wallet creation process is cancelled, and the user is redirected to the creating a new wallet page

      - Click on "Create a new wallet" button
   	  -	Click on "Back up manually" button
   	  - Check all check-boxes 
   	  - Click on "Continue" button      
      - Verify that a randomly generated 12-word seed phrase is displayed
      - Check that the seed phrase is easy to read and understand
      - Verify the option to copy the seed phrase to the clipboard
      - Check if the seed phrase is stored securely and not visible to others

   3.4 Seed Phrase Verification:
      - Prompt the user to enter the seed phrase in the correct order.
      - Enter the seed phrase incorrectly and verify the appropriate error message is displayed.
      - Verify that the user can skip this step but with a clear warning about the risks involved.

   3.5 Wallet Created Successfully:
      - Verify that the user is redirected to the main wallet screen after successful creation.
      - Check that the wallet displays a balance of zero for all supported cryptocurrencies.
      - Ensure that the wallet address is generated correctly for the selected cryptocurrency network.

   3.6 Wallet Recovery:
      - Test the wallet recovery process using the seed phrase.
      - Verify that the user can recover the wallet successfully with the correct seed phrase and password.
      - Test wallet recovery with an incorrect seed phrase and validate the appropriate error message.

4. Test Data:
   - Valid passcode (minimum and maximum length)
   - Valid and invalid seed phrases
   - Test accounts on different cryptocurrency networks for recovery testing

5. Test Execution:
   - Execute each test scenario and record the results.
   - Capture any defects or issues encountered during the test.
   - Report the test results and provide detailed steps to reproduce any identified issues.

6. Test Coverage:
   - Test the flow of creating a new wallet from start to finish.
   - Test different scenarios for password validation, seed phrase display, and recovery.
   - Verify the encryption of the wallet and access control through password protection.

Test Deliverables:
   - Test plan document
   - Test cases with detailed steps and expected results
   - Test execution report with identified defects and issues

Note: The test plan provided above is a sample and may need customization based on specific requirements and features of the TrustWallet Android application.
