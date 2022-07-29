package config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

/**
 * Note#2:
 * Class responsible for creating TestContext.
 * @CucumberContextConfiguration annotation says that this class is responsible for TestContext
 * @ContextConfiguration annotation refers to class with Spring Configuration which should be applied.
 */
@CucumberContextConfiguration
@ContextConfiguration(classes = AppConfiguration.class)
public class CucumberSpringConfiguration {
}
