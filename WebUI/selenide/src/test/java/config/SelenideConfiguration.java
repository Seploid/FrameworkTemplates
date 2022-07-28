package config;

import com.codeborne.selenide.Configuration;
import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class SelenideConfiguration {

    @Value("${site.url:localhost}")
    private void setBaseUrl(String siteUrl) {
        Configuration.baseUrl = siteUrl;
    }

    @Value("${browser:chrome}")
    private void setBrowser(String browser) {
        Configuration.browser = browser;
    }
}
