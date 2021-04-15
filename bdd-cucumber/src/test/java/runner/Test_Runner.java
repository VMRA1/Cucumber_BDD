package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},glue= {"stepdefinitions"},
monochrome=true,dryRun=false,strict=true,plugin= {"html:testoutput/results.html","junit:testoutput/results.xml","json:testoutput/results.json"})
public class Test_Runner {


}
