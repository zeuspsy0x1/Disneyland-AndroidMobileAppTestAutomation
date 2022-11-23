package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AddPlanScreen;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

/**
 * Navigates to the Dashboard screen then goes to Add plan screen and validates visibility of plan option elements.
 * @author Zeus.Vargas
 */
public class AddPlansTest extends BaseMobileTest {

    @Description(value = "Add Plans test")
    @Test()
    public void addPlansTest() {
        log.info("***** Add Plans Test starting *****");
        log.info("Loading DashBoard and going to the menu");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        AddPlanScreen addPlan = dashBoard.clickOnAddPlanOption();

        addPlan.clickAddPlan();

        log.info("Validate that List Of PlanOptions is displayed");
        Assert.assertTrue(addPlan.isListOfPlanOptionsDisplayed(), "List Of PlanOptions is not displayed");

        log.info("Validate that Check dining availability is displayed");
        Assert.assertTrue(addPlan.isDiningAvailabilityDisplayed(), "Check dining availability is not displayed");

        log.info("***** Add Plans Test ended *****");
    }
}
