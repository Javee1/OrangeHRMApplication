package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",glue="StepDefination",monochrome = true,

                                      //dryRun = true
                                   tags="@sanity",
                                   //tags="@smoke"
                                		   plugin = { "pretty",
                                				   "html:target/OrangeHRMApplicationReports",
                                				   "json:target/OrangeHRMApplicationJsonReport.json",
                                				   "com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
                                				   }
                                       
                                      )


public class TestRunner {

}
