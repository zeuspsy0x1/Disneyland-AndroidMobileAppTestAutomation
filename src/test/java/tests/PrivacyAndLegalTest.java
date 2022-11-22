package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MenuScreen;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    /**
     * Validate menu and Privacy and Legal Navigation.
     */
    @Description(value = "Privacy and Legal test")
    @Test()
    public void navigateToPrivacyAndLegalTest() {
        log.info("Loading DashBoard and going to the menu");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MenuScreen menu = dashBoard.clickOnMenuOption();

        log.info("Validate that the image from menu categories is displayed");
        Assert.assertTrue(menu.isCategoriesBannerBeingDisplayed(), "menu categories is not being displayed");

        menu.scrollToTheBottomOfTheScreen();

        log.info("Validate that Profile category is displayed");
        Assert.assertTrue(menu.isProfileCategoryDisplayed(), "Profile is not being displayed");
        log.info("Validate that Property Rules is displayed");
        Assert.assertTrue(menu.isPropertyRulesDisplayed(), "Property Rules is not being displayed");
        log.info("Validate that Cast Compliment is displayed");
        Assert.assertTrue(menu.isCastComplimentDisplayed(), "Cast Compliment is not being displayed");
        log.info("Validate that Link To Account is displayed");
        Assert.assertTrue(menu.isLinkToAccountDisplayed(), "Link To Account is not being displayed");
        log.info("Validate that Car Locator is displayed");
        Assert.assertTrue(menu.isCarLocatorDisplayed(), "Car Locator is not being displayed");
        log.info("Validate that Help is displayed");
        Assert.assertTrue(menu.isHelpDisplayed(), "Help is not being displayed");
        log.info("Validate that Privacy And Legal is displayed");
        Assert.assertTrue(menu.isPrivacyAndLegalDisplayed(), "Privacy And Legal is not being displayed");

        menu.clickPrivacyAndLegalButton();

        log.info("Validate that Privacy And Legal header text is displayed");
        Assert.assertTrue(menu.isPrivacyAndLegalHeaderDisplayed(), "Privacy And Legal header text is not being displayed");

        log.info("Validate that Privacy Policy is displayed");
        Assert.assertTrue(menu.isPrivacyPolicyDisplayed(), "Privacy Policy is not being displayed");
        log.info("Validate that Terms Of Use is displayed");
        Assert.assertTrue(menu.isTermsOfUseDisplayed(), "TermsOfUse is not being displayed");
        log.info("Validate that Supplemental Terms And Conditions is displayed");
        Assert.assertTrue(menu.isSupplementalTermsAndConditionsDisplayed(), "Supplemental Terms And Conditions is not being displayed");
        log.info("Validate that Legal Notices is displayed");
        Assert.assertTrue(menu.isLegalNoticesDisplayed(), "Legal Notices is not being displayed");
        log.info("Validate that Property Rules Option is displayed");
        Assert.assertTrue(menu.isPropertyRulesOptionDisplayed(), "Property Rules Option is not being displayed");
        log.info("Validate that Electronic Communication Disclosure is displayed");
        Assert.assertTrue(menu.isElectronicCommunicationDisclosureDisplayed(), "Electronic Communication Disclosure is not being displayed");
        log.info("Validate that Your California Privacy Rights is displayed");
        Assert.assertTrue(menu.isYourCaliforniaPrivacyRightsDisplayed(), "California Privacy Rights is not being displayed");
        log.info("Validate that Do Not Sell My Personal Information is displayed");
        Assert.assertTrue(menu.isDoNotSellMyPersonalInformationDisplayed(), "Do Not Sell My Personal Information is not being displayed");
        log.info("Validate that In App Maps Subject To Google Terms And Conditions is displayed");
        Assert.assertTrue(menu.isInAppMapsSubjectToGoogleTermsAndConditionsDisplayed(), "In App Maps Subject To Google Terms And Conditions is not being displayed");
        log.info("Validate that In App Maps Subject To Google Privacy Policy is displayed");
        Assert.assertTrue(menu.isInAppMapsSubjectToGooglePrivacyPolicyDisplayed(), "In App Maps Subject To Google Privacy Policy is not being displayed");
    }
}
