package com.up2test.amazon.e2eTestAutomation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		plugin = {"pretty", "html: target/CucumberReport.html", "json: target/CucumberReport.json"},
		tags = ("@MultiConnection"), 
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)

public class TestRunner {

}
