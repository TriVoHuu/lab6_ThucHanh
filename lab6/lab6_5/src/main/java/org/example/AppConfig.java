package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
        @PropertySource("classpath:app.properties")
})
public class AppConfig {
    @Value("${text}")
    private String text;

    @Bean
    public String getText(){
        return text;
    }
}
