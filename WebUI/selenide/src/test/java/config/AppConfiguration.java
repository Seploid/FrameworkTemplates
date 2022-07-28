package config;

import org.springframework.context.annotation.*;

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
