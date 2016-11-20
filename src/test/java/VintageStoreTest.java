import com.google.gson.JsonObject;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VintageStoreTest extends TestCase
{
    @Before
    public void setUp(){}

    @After
    public void tearDown() {}

    @Test
    public void validateItemsData(JsonObject dbSearchResults)
    {
        /**
         * Chen,
         * I am not sure about what is asked and which entities should I implement and which are assumed.
         * So, i'll explain what I would do:
         *
         * 1. searchResultsobj has methods for each element (item name, preview button etc.) that return corresponding WebElement.
         *
         *
         * 2. JSONObjects can be easily converted to Java objects and vice versa with Gson.
         *
         * 4. We will iterate over the items of searchResultsobj.resultItemsArrList
         *    in each iteration we'll assert that the WebElement is in dbSearchResults object,
         *    We will compare (make an assertion) the attributes on (WebElement.getText() / src / etc.)
         *    and the respective attribute.
         *    in the last iteration, if searchResultsobj.nextPageButton.isEnabled() we will click on by that keep on iterating over the new searchResultsobj.resultItemsArrList
         *
         * 5. if no AssertionError was thrown, the test will pass.
         */
    }

    class SearchResultsPage {}

    @Test
    public void validatePreviewWorking(SearchResultsPage searchResultsobj, int year)
    {
        /**
         * Chen,
         * I am not sure about what is asked and which entities should I implement and which are assumed.
         * So, i'll explain what I would do:
         *
         * 1. searchResultsobj has methods for each element (item name, preview button etc.) that return corresponding WebElement.
         *
         *
         * 2. in each iteration We will compare (make an assertion) the year's WebElement.getText()
         *    and the respective attribute in search result object.
         *    if the year is bigger than "year" param,
         *    We will make the correct assertion (“audio is playing” / “video is playing” etc.) after clicking the preview button.
         *    we'll get the expected year by checking the item type.
         *
         * 3. if no AssertionError was thrown, the test will pass.
         */
    }
}
