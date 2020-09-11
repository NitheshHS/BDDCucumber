package stepDefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class DataDrivenSStepDef {
	@Given("^user enter Firstname and LastName$")
	public void user_enter_Firstname_and_LastName(DataTable datatable) throws Throwable {
	   List<List<String>> data = datatable.asLists(String.class);
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
		//3386225
		//4-7-97
	}

}
