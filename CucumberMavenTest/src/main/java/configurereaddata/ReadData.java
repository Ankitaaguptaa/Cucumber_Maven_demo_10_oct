package configurereaddata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadData 
{

	Properties prop;
	FirefoxDriver driver;
	public  ReadData()
	{
		
		File src= new File("./Configuration/config.property");
		try {
			FileInputStream fin= new FileInputStream(src);
			 prop= new Properties();
			prop.load(fin);
			
		} catch (Exception e) 
		{
			System.out.println("exception>>>>>>>>>>"+e.getMessage());
		}
	}
	

	
	public String getApplication()
	
	{
		return(prop.getProperty("url"));
	}
	
	public String getdataXpath()
	{
		
		return(prop.getProperty("DataenterXpath"));
	}
	
	public String getSmartLinkXpath()
	{
		
		return(prop.getProperty("smartfocuslinkXpath"));
		
	}
	
	

	public String getDriver() {
		return(prop.getProperty("ChromeDriver"));
				
	}
}
