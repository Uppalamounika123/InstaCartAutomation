package RunnerFiles;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Resource\\instacart.feature"
//		glue={"stepdefinition"},
//		tags= {"@instacartpage"}
		)


public class InstaCartRunner{
}