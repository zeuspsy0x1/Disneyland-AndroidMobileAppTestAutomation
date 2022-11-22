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
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */

    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"android:id/button2\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"dismiss-icon\")")
    private AndroidElement dismissWelcome;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator =
            "new UiSelector().className(\"android.widget.ImageView\").descriptionContains(\"Map\")")
    @AndroidFindBy(uiAutomator =
            "new UiSelector().descriptionContains(\"Map\")")
    private AndroidElement mapButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.ImageView).descriptionContains(\"More\")")
    private AndroidElement menuButton;

    /**
     * @author zeus.vargas, refactored code by from hans.marquez goToMapScreen method.
     * Close dismiss buttons at dashboard screen.
     */
    public void dismissButtonsAtDashboardScreen(){
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
    }

    /**
     * @author Hans.Marquez, refactored by zeus.vargas
     * Navigate to Login Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        dismissButtonsAtDashboardScreen();
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * @author Zeus.Vargas
     * Click menu button at dashboard screen
     */
    public MenuScreen clickOnMenuOption() {
        dismissButtonsAtDashboardScreen();
        if (this.isElementAvailable(menuButton, 25)){
            click(menuButton);
        }
        return new MenuScreen(driver);
    }

    /**
     * @author Zeus.Vargas
     * Click menu button at dashboard screen
     */
    public AddPlanScreen clickOnAddPlanOption() {
        dismissButtonsAtDashboardScreen();
        if (this.isElementAvailable(menuButton, 25)){
            click(menuButton);
        }
        return new AddPlanScreen(driver);
    }
}


