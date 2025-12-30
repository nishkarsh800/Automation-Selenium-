package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        var scrollPage = homePage.clickLargeAndDeepDom();
        scrollPage.scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        var scrollToPara = homePage.clickInfiniteScroll();
        scrollToPara.scrollToParagraph(5);
    }
}
