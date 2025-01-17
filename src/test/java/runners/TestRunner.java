package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@login",
        // tags = "@sanity or @ui or @sanity",
        // tags = "@sanity and @ui",

        monochrome = true,
        plugin = {"pretty","html:target/report.html"}

)

public class TestRunner
{

}
