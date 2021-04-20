package co.com.choucair.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/utest.feature",
        tags = "@stories",
        glue = "co.com.choucair.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}