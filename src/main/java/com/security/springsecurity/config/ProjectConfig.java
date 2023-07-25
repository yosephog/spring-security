package com.security.springsecurity.config;

import com.security.springsecurity.security.CustomAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ProjectConfig {

    private final CustomAuthenticationProvider customAuthenticationProvider;

}
