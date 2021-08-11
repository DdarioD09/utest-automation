package co.com.choucair.challenge.utestautomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest_challenge.feature",
        tags = "@stories",
        glue = "co.com.choucair.challenge.utestautomation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
