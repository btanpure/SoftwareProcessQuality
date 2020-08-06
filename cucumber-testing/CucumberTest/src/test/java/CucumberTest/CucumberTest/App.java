package CucumberTest.CucumberTest;

public class App 
{
    public static void main( String[] args )
    {
        weatherCheck a = new weatherCheck();
    	System.out.println(a.check_wind(18.0,5.0,25.0));
    }
}
