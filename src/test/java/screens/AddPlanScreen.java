package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class AddPlanScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public AddPlanScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tab_animated_icon\")")
    private AndroidElement addPlanButton;
    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"com.disney.wdpro.dlr:id/actionSheetListView\")")
    private AndroidElement listOfPlanOptions;
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.FrameLayout\").descriptionContains(\"Check Dining Availability\")")
    private AndroidElement diningAvailability;


    public void clickAddPlan(){
        click(addPlanButton);
    }

    public boolean isListOfPlanOptionsDisplayed(){
        return this.isElementAvailable(listOfPlanOptions);

    }
    public boolean isDiningAvailabilityDisplayed(){
        return this.isElementAvailable(diningAvailability);

    }
}


