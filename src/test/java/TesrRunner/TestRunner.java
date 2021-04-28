package TesrRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Tech Jargon//Documents//TestAutomation//GmailTests//src//test//resources//features//Login.feature",
        glue = "stepDefs")
public class TestRunner {
}
