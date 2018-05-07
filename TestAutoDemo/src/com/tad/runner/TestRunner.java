package com.tad.runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features="com/tad/features",
glue="com.tad.stepdefinition",
plugin={"pretty","html:reports/test-report"})

public class TestRunner {
	
	
	

}
