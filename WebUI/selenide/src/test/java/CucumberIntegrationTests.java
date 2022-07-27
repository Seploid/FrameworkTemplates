import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")
public class CucumberIntegrationTests {
}
