package com.autom4tion.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "pretty"
        },

        features = "src\\test\\resources\\features",
        glue = "com/autom4tion/library/step_definitions",
        dryRun = true,
        tags = ""
)

public class CukeRunner {
}
