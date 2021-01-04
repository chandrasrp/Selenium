package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTests extends BaseTests {

   @Test
   public void testSelectedOptions(){
       DropdownPage dropDownPage = homePage.clickDropdown();
       dropDownPage.selectFromDropdown("Option 1");
       List<String> selectedOptions = dropDownPage.getSelectedoptions();

        assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
       String option = "Option 1";
       assertTrue(selectedOptions.contains(option), "Option not selected" );

   }
}
