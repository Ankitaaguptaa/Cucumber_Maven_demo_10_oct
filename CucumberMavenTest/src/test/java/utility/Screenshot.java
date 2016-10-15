package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

;

public class Screenshot

{

	public static void captureScreenshot(WebDriver driver) {
		TakesScreenshot sc = (TakesScreenshot) driver;

		File src = sc.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshot/facebook.png");

		

				try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					System.out.println("Exception======="+e.getMessage());
				}

	}
}
