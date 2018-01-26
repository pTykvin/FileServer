package ru.tykvin.hermes.auth.configuration;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@RequiredArgsConstructor
@Configuration
@ConfigurationProperties("api")
public class AuthConfiguration {
    private String secret;

}