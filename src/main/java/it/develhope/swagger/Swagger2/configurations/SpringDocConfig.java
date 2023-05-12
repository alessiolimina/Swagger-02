package it.develhope.swagger.Swagger2.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

    @OpenAPIDefinition
    @Configuration
    public class SpringDocConfig {
        @Bean
        public OpenAPI baseOpenApi(){
            return new OpenAPI().info(new Info().title("Exercise Swagger-02")
                            .version("1.0.0")
                            .description("An exercise illustrating math operations with Swagger")
                            .contact(new Contact()
                                    .name("Alessio Limina")
                                    .email("alessio.limina@gmail.com")
                                    .url("https://www.develhope.co")))
                    .tags(List.of(new Tag().name("default-controller").description("Main controller for all the APIs"),
                            new Tag().name("math-controller").description("Controller for math operations")));
        }
    }




