import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException 
	{
			
		//1. Launch browser
		ChromeDriver driver = new ChromeDriver(); // pre-defined class

		
		//2. Open website
		driver.get("https://demo.opencart.com/");
		
	    //3. Fetch the title
		String actualTitle = driver.getTitle();
		
		//4. Compare expected and actual(fetched) title
		//5. Display the result
		String expectedTitle = "Your Store";
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		if(expectedTitle.contentEquals(actualTitle))
		{
			System.out.println("Title verification passed");
		}
		else
		{
			System.out.println("Title verification failed");
		}

		//6. Close browser
		Thread.sleep(5000); // website will close within 5 seconds after opening
		driver.close();
		
		

	}

}
