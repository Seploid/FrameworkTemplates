import org.junit.platform.suite.api.*;

/**
 * Note#1:
 * Entry point for cucumber tests, @IncludeEngines annotation is responsible for that.
 * @SelectClasspathResource annotation responsible for location for feature files.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class CucumberIntegrationTests {
}
