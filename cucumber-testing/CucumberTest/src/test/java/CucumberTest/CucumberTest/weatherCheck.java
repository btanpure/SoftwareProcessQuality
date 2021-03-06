package CucumberTest.CucumberTest;

public class weatherCheck 
{
	double temp, wind_speed, pressure;
	double a_wind_speed = 3;
	double b_wind_speed = 7;
	double a_pressure = 26;
	double b_pressure = 31;
	String result;
	public weatherCheck(double temp, double wind_speed, double pressure) {
		super();
		this.temp = temp;
		this.wind_speed = wind_speed;
		this.pressure = pressure;
	}
	
	public weatherCheck() {
	}

	String check_wind(double temp, double wind, double pressure)
	{
		if(temp>20)
		{
			if(wind>a_wind_speed)
				return check_pressure("a",pressure);
			else
				return "No Rain";
		}
		else
		{
			if(wind>b_wind_speed)
				return "Rain";
			else
				return check_pressure("b",pressure);
		}
	}
	
	String check_pressure(String w_case, double pressure)
	{
		if(w_case.equals("a"))
		{
			if(pressure>a_pressure)
				return "Rain";
			else
				return "No Rain";
		}
		else
		{
			if(pressure>b_pressure)
				return "Rain";
			else
				return "No Rain";
		}
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
