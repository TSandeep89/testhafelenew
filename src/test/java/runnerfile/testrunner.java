package runnerfile;
//import io.cucumber.testng.CucumberOptions;
//import org.junit.runner.RunWith;
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "C://Users//tsandeep//IdeaProjects//BDD-framework//features//login.feature",
//        glue = "stepdefinations",
//        dryRun = false,
//        plugin= {"pretty", "html:test-output",
//        }
//)
//
//
//public class testrunner {
//}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature",
        monochrome = true,
        // plugin = {"json:target/cucumber-report/runwebat/cucumber.json",
        // "rerun:target/cucumber-report/runwebat/rerun.txt"},
        glue = {"stepdefinations"}, dryRun = false, strict = true)
public class testrunner {
}
