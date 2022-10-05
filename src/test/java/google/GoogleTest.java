package google;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;

public class GoogleTest extends BaseTest {

    @Test
    public void testSearchPage(){
        SearchGoogle.entryTheData(webDriver, "Falabella.co");

    }

}
