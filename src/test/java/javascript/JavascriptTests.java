package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        var scrollPage = homePage.clickLargeAndDeepDom();
        scrollPage.scrollToTable();
    }
}
