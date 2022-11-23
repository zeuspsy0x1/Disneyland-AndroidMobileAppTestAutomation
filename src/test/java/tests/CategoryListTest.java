package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;


/**
 * Navigates to the Map screen and validates visibility of Attraction categories elements.
 * @author Zeus.Vargas
 */
public class CategoryListTest extends BaseMobileTest {

    @Description(value = "Map screen navigation and attraction categories test")
    @Test()
    public void categoryListTest() {
        log.info("***** Category List Test starting *****");

        log.info("Starting Navigation to Map Screen");

        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.isShowListDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.isCategoryDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.isFilterDisplayed(), "Filter not displayed");

        log.info("Validate that Map Container is displayed");
        Assert.assertTrue(map.isMapContainerDisplayed(), "Map Container is not displayed");

        log.info("Validate that Attractions category is displayed");
        Assert.assertTrue(map.isCategoryDisplayed(), "Attractions category is not displayed");

        map.clickAttractionsCategoryList();

        log.info("Validate that the select category is displayed");
        Assert.assertTrue(map.isSelectCategoryDisplayed(), " select categories header is not displayed");

        log.info("Validate that hotels category is displayed");
        Assert.assertTrue(map.isHotelsDisplayed(), "hotels category header is not displayed");

        log.info("***** Category List Test ended *****");
    }
}
