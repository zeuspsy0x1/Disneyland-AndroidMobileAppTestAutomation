package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class MapScreenAndAttractionsTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen navigation and attraction categories test")
    @Test()
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");


        log.info("Validate that Map Container is displayed");
        Assert.assertTrue(map.isMapContainerDisplayed(), "Map Container is not displayed");

        log.info("Validate that Attractions category is displayed");
        Assert.assertTrue(map.categoryIsDisplayed(), "Attractions category is not displayed");

        map.clickAttractionsCategoryList();

        log.info("Validate that the select category is displayed");
        Assert.assertTrue(map.selectCategoryIsDisplayed(), " select categories header is not displayed");

        log.info("Validate that hotels category is displayed");
        Assert.assertTrue(map.isHotelsDisplayed(), "hotels category header is not displayed");

    }
}
