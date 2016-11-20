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
         * 2. JSONObject / JSONarray does not maintain order so we will have to iterate over all items in dbSearchResults until we find the required object.
         *
         * 3. JSONObjects can be easily converted to Java objects and vice versa with Gson.
         *
         * 4. in each iteration We will compare (make an assertion) the attributes on WebElement.getText()
         *    or the given source (src) and the respective attribute.
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
         * 2. JSONObject / JSONarray does not maintain order so we will have to iterate
         *    over all items in dbSearchResults until we find the required object.
         *
         * 3. in each iteration We will compare (make an assertion) the year's WebElement.getText()
         *    and the respective attribute in search result object.
         *    We will make the correct assertion (“audio is playing” / “video is playing” etc.)
         *    by checking the item type first (more ways to do it).
         *
         * 4. if no AssertionError was thrown, the test will pass.
         */
    }
}
