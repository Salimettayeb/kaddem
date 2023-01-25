package tn.esprit.demo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("Kaddem").description("Project").contact(contactAPI());
    }

    public Contact contactAPI() {
        return new Contact().name("salim").email("salim.ettayeb@esprit.tn").url("https://www.linkedin.com/in/salim-ettayeb/");
    }

    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("etudiant")
                .pathsToMatch("/etudiant/**", "/equipe/**", "/department/**","/contrat/**")
                .pathsToExclude("**")
                .build();

    }
}
