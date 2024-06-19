package feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/feature/Componentes.feature", glue = "", tags = "@validar_campo_textfield")
public class TestRunner {

}
