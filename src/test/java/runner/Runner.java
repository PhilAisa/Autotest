package runner;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "@Test#1, @Test#2",
        glue = "test",
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        plugin = {"json:target/cucumber.json"}
)

public class Runner {
    @BeforeClass
    static public void setupTimeout() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 4000;
        open("http://10.0.0.145:9995/dfenew/login.jsp");
    }
}
