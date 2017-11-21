package steps;

import java.net.URL;
import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class Hook extends BaseUtil {

    /**
     * Define steps just like in CommonAPI for Web Automation.
     * @Before and @After Annotations are from Cucumber Dependency.
     *
     * In some classes I create an object from BaseUtil class,
     * and make a Constructor that passes BaseUtil as signature.
     * This is called Dependency Injection.
     */

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws MalformedURLException {
        System.out.println("********************************************************************");
        System.out.println("*******************************START********************************");
        System.out.println("********************************************************************");
        System.out.println("Opening The Browser: Chrome");
        //local execution
        //System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
        //base.driver = new ChromeDriver();

        //selenium grid execution
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        base.driver = new RemoteWebDriver(new URL("http://docker:4444/wd/hub"),capabilities);
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            // Take Screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("********************************************************************");
        System.out.println("*******************************FINISH*******************************");


        base.driver.quit();
    }
}
