package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AddPlanScreen;
import screens.DashBoardScreen;
import screens.MenuScreen;
import util.tests.BaseMobileTest;

public class AddPlansTest extends BaseMobileTest {

    /**
     * Validate menu and Privacy and Legal Navigation.
     */
    @Description(value = "Privacy and Legal test")
    @Test()
    public void navigateToPrivacyAndLegalTest() {
        log.info("Loading DashBoard and going to the menu");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        AddPlanScreen addPlan = dashBoard.clickOnAddPlanOption();

        addPlan.clickAddPlan();

        log.info("Validate that List Of PlanOptions is displayed");
        Assert.assertTrue(addPlan.isListOfPlanOptionsDisplayed(), "List Of PlanOptions is not displayed");

        log.info("Validate that Check dining availability is displayed");
        Assert.assertTrue(addPlan.isDiningAvailabilityDisplayed(), "Check dining availability is not displayed");

    }
}
