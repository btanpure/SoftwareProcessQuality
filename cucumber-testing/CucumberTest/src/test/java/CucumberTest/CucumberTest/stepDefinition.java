package CucumberTest.CucumberTest;
import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepDefinition {
	
	weatherCheck a = new weatherCheck();
	String result;
	@Given("the temp is {double} degree Celsius")
	public void the_temp_is_more_than_degree_Celsius(Double double1) {
	   a.setTemp(double1);
	   System.out.println("\n The temperature is: "+a.getTemp()+" Celsius");
	}

	@Given("the wind speed is {double} kmph")
	public void the_wind_speed_is_kmph(Double double1) {
	    a.setWind_speed(double1);
	    System.out.println(" The wind speed is: "+a.getWind_speed()+" kmph");
	}

	@When("the pressure is {double} inHg")
	public void the_pressure_is_inHg(Double double1) {
	    a.setPressure(double1);
	    System.out.println(" The pressure is: "+a.getPressure()+" inHg");
	    result = a.check_wind(a.getTemp(), a.getWind_speed(), a.getPressure());
	}

	
	@Then("I validate that result is {string}")
	public void i_validate_that_result_is(String string) {
		assertEquals(result, string);
		System.out.println(" There will be "+result);
	}
}
