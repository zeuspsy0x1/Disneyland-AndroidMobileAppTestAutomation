package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class MenuScreen extends BaseScreen {

    public MenuScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/avatarImage\")")
    private AndroidElement avatarImageInMenuCategories;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"My Profile\")")
    private AndroidElement myProfileCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Property Rules\")")
    private AndroidElement propertyRulesCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Cast Compliment\")")
    private AndroidElement castComplimentCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Link to Account\")")
    private AndroidElement linkToAccountCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Car Locator\")")
    private AndroidElement carLocatorCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Help\")")
    private AndroidElement helpCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\").textMatches(\"Privacy & Legal\")")
    private AndroidElement privacyAndLegalCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").textMatches(\"Privacy & Legal\")")
    private AndroidElement privacyAndLegalHeaderText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Privacy Policy\")")
    private AndroidElement privacyPolicyOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Terms of Use\")")
    private AndroidElement termsOfUseOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Legal Notices\")")
    private AndroidElement legalNoticesOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Property Rules\")")
    private AndroidElement propertyRulesOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Electronic Communications Disclosure\")")
    private AndroidElement electronicCommunicationDisclosureOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Your California Privacy Rights\")")
    private AndroidElement yourCaliforniaPrivacyRightsOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"Do Not Sell My Personal Information\")")
    private AndroidElement doNotSellMyPersonalInformationOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"In-App Maps Subject to Google Terms and Conditions\")")
    private AndroidElement inAppMapsSubjectToGoogleTermsAndConditionsOption;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/txt_element\").textMatches(\"In-App Maps Subject to Google Privacy Policy\")")
    private AndroidElement inAppMapsSubjectToGooglePrivacyPolicyOption;

    public boolean isProfileCategoryDisplayed() { return isElementAvailable(myProfileCategory);}
    public boolean isPropertyRulesDisplayed() { return isElementAvailable(propertyRulesCategory);}
    public boolean isCastComplimentDisplayed() { return isElementAvailable(castComplimentCategory);}
    public boolean isLinkToAccountDisplayed() { return isElementAvailable(linkToAccountCategory);}
    public boolean isCarLocatorDisplayed() { return isElementAvailable(carLocatorCategory);}
    public boolean isHelpDisplayed() { return isElementAvailable(helpCategory);}
    public boolean isPrivacyAndLegalDisplayed() { return isElementAvailable(privacyAndLegalCategory);}
    public boolean isPrivacyAndLegalHeaderDisplayed() { return isElementAvailable(privacyAndLegalHeaderText);}

    public boolean isPrivacyPolicyDisplayed() { return isElementAvailable(privacyPolicyOption);}
    public boolean isTermsOfUseDisplayed() { return isElementAvailable(termsOfUseOption);}
    public boolean isSupplementalTermsAndConditionsDisplayed() { return isElementAvailable(supplementalTermsAndConditionsOption);}
    public boolean isLegalNoticesDisplayed() { return isElementAvailable(legalNoticesOption);}
    public boolean isPropertyRulesOptionDisplayed() { return isElementAvailable(propertyRulesOption);}
    public boolean isElectronicCommunicationDisclosureDisplayed() { return isElementAvailable(electronicCommunicationDisclosureOption);}
    public boolean isYourCaliforniaPrivacyRightsDisplayed() { return isElementAvailable(yourCaliforniaPrivacyRightsOption);}
    public boolean isDoNotSellMyPersonalInformationDisplayed() { return isElementAvailable(doNotSellMyPersonalInformationOption);}
    public boolean isInAppMapsSubjectToGoogleTermsAndConditionsDisplayed() { return isElementAvailable(inAppMapsSubjectToGoogleTermsAndConditionsOption);}
    public boolean isInAppMapsSubjectToGooglePrivacyPolicyDisplayed() { return isElementAvailable(inAppMapsSubjectToGooglePrivacyPolicyOption);}

    public boolean isCategoriesBannerBeingDisplayed(){
        return isElementAvailable(avatarImageInMenuCategories);
    }
    public void scrollToTheBottomOfTheScreen(){
        log.info("Scrolling to privacy and legal category");
        while(!isPrivacyAndLegalDisplayed()){
            scrollDown();
        }
    }
    public void clickPrivacyAndLegalButton(){
        log.info("Clicking privacy and legal category");
        click(privacyAndLegalCategory);
    }
}
