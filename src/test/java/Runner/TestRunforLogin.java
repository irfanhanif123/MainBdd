package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature",
        glue = {"JavaSteps"},
        plugin = {"pretty", "html:target/HtmlReports"}
)




public class TestRunforLogin {
}
