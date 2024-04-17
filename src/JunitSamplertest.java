import org.junit.Assert;
import org.junit.Test;

public class JunitSamplertest {
//	public static WebDriver driver;

//	@Before
//	public void setup() {
//
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\dibya\\OneDrive\\Documents\\OneNote Notebooks\\edgedriver_win64 (1)\\msedgedriver.exe");
////		WebDriverManager.chromedriver().setup();
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//	}

	@Test
	public void TestData() throws InterruptedException {

//		driver.get("https://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Jmeter Testing");
//		Thread.sleep(3000);
		for (int i = 0; i < 30; i++) {
			int randomnumber = (int) (Math.random() * 100);
			System.out.println(randomnumber);
			Assert.assertEquals(0, randomnumber * 2);
		}
		// System.out.println("Executing test");
	}

//	@After
//	public void teardown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
