package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\appFeatures\\Search.feature"},
                 glue = { "step"})

class AmazonTestRunner {

}
