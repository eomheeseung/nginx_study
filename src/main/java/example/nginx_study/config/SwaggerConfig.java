
package example.nginx_study.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(info());
    }

    private Info info() {
        return new Info().title("nginx test").description("nginx sutdy").version("0.0.1");
    }
}
