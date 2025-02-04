package jc.belajar.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "", //untuk memanggil test // and = yang sesuai dengan deklari nama, or = yang penting ada
        features = {
//                "src/test/resources/features", // untuk menjalankan semua
//                "src/test/resources/features/Authentication.feature",
//                "src/test/resources/features/Checkout.feature",
                "src/test/resources/features/kalkulator_bmi.feature"

        },
        glue = {"jc.belajar.cucumber.definitions",
//                "jc.belajar.cucumber.hooks", // memanggil hooks

        },
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
