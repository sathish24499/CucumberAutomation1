package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.MyReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ARUN\\eclipse-workspace\\CucumberMyProject\\src\\test\\resources\\Feature\\logging.feature",
glue="org.step",monochrome=true,dryRun=false,
plugin= {
		"html:target\\htmlreport",
		"junit:target\\junitreport.xml",
		"json:target\\jsonreport.json"	})
	public class RunneerrCClass {	
	
	@AfterClass
	public static void methodforReprt()
	{
	MyReport.generateReport("target\\jsonreport.json");
}
}