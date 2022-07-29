package config;

import org.springframework.context.annotation.*;

/**
 * Note#3
 * ApplicationConfiguration class includes other configurations in separate classes or in properties.
 * @Configuration says that class is Spring configuration.
 * @ComponentScans annotation says which packages contain components which should be included in the context.
 * @Import annotation says that there is a few more configurations which should be applied.
 * @PropertySources annotation says which property file variables should be applied.
 */
@Configuration
@Import(SelenideConfiguration.class)
@ComponentScans({
        @ComponentScan("ui.pages")
})
@PropertySources({
        @PropertySource("classpath:environments/${ENV:prod}.properties")
})
public class AppConfiguration {
}
