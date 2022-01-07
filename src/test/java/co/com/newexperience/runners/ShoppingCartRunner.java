package co.com.newexperience.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/shoppingpage.feature",
        glue = "co.com.newexperience.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ShoppingCartRunner {

}
