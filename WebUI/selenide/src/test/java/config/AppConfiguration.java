package config;

import org.springframework.context.annotation.*;

@Configuration
@Import(SelenideConfiguration.class)
@PropertySources({
        @PropertySource("classpath:environments/${ENV:prod}.properties")
})
public class AppConfiguration {
}
