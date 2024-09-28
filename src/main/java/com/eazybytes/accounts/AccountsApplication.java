package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@EnableConfigurationProperties({ AccountsContactInfoDto.class })
@OpenAPIDefinition(
        info = @Info(
                title = "Account microservices REST API documentation",
                description = "EazyBank account microservices REST API documentation",
                version = "v1",
                contact = @Contact(
                        name = "Nikola Suscevic",
                        email = "nikola.suscevic@gmail.com",
                        url = "https:/www.eazybytes.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.eazybytes.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank account microservices REST API documentation",
                url = "https://www.eazybytes.com/swagger-ui.html"

        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
