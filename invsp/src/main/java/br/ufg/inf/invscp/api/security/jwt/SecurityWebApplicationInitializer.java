package br.ufg.inf.invscp.api.security.jwt;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import br.ufg.inf.invscp.api.security.jwt.config.WebSecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	
	public SecurityWebApplicationInitializer() {
        super(WebSecurityConfig.class);
    }
}
