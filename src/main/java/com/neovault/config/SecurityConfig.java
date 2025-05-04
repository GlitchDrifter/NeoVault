package com.neovault.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebSecurity
class SecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(auth -> auth
        .requestMatchers("/").permitAll()
        .requestMatchers("/login").permitAll()
        .requestMatchers("/logout").permitAll()
        .anyRequest().authenticated()).formLogin(form -> form.defaultSuccessUrl("/", true))
        .logout(config -> config.logoutSuccessUrl("/"));
    return http.build();
  }
}
