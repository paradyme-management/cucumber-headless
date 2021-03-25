package io.tpd.springbootcucumber.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "json:target/cucumber/cucumber.json"},
        extraGlue = "io.tpd.springbootcucumber.bagcommons")
public class BagCucumberIntegrationTest {
}
