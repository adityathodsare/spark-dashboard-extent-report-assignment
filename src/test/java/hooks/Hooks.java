package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
        ExtentCucumberAdapter.addTestStepLog("Browser launched successfully");
    }

    @After
    public void tearDown() {
        ExtentCucumberAdapter.addTestStepLog("Closing browser");
        DriverFactory.quitDriver();
    }
}
