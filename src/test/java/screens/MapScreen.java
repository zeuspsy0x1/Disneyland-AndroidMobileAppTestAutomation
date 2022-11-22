package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import java.util.ArrayList;
import java.util.List;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

// TODO: Auto-generated Javadoc

/**
 * Map screen.
 *
 * @author Hans.Marquez
 */
public class MapScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Hans.Marquez
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categoryTitle\")")
    private AndroidElement categoryList;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*filterTitle.*\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Filter\")")
    private AndroidElement filterButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*toggleTitle.*\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Show List\")")
    private AndroidElement showListButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*bottomSheetContainer.*\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"bottomSheetContainer\")")
    private AndroidElement mapContainer;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/categorySelectHeader\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categorySelectHeader.*\")")
    private AndroidElement selectCategoryHeader;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*facilityTypeTitle\").textContains(\"Hotels\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.LinearLayout\").descriptionContains(\"Hotels\")")
    private AndroidElement hotelsSelector;

    /**
     * @author Hans.Marquez
     * return true if Category List element is displayed in screen, otherwise false.
     */
    public boolean categoryIsDisplayed() {
        return isElementAvailable(categoryList);
    }

    /**
     * @author Hans.Marquez
     * return true if Filter Button element is displayed in screen, otherwise false.
     */
    public boolean filterIsDisplayed() {
        return isElementAvailable(filterButton);
    }

    /**
     * @author Hans.Marquez
     * return true if Show List Button element is displayed in screen, otherwise false.
     */
    public boolean showListIsDisplayed() {
        return isElementAvailable(showListButton);
    }

    /**
     * @author Zeus.Vargas
     * return true if mapContainer element is displayed in screen, otherwise false.
     */
    public boolean isMapContainerDisplayed() {
        return isElementAvailable(mapContainer);
    }

    /**
     * @author Zeus.Vargas
     * return true if mapContainer element is displayed in screen, otherwise false.
     */
    public void clickAttractionsCategoryList() {
        click(categoryList);
    }

    /**
     * @author Zeus.Vargas
     * return true if Select Category header is displayed in screen, otherwise false.
     */
    public boolean selectCategoryIsDisplayed() {
        return isElementAvailable(selectCategoryHeader);
    }

    /**
     * @author Zeus.Vargas
     * return true if Select Category header is displayed in screen, otherwise false.
     */
    public boolean isHotelsDisplayed() {
        return isElementAvailable(hotelsSelector);
    }
}
