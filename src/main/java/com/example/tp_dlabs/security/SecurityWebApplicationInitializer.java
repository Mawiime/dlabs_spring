package com.example.tp_dlabs.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * https://docs.spring.io/spring-security/site/docs/current/reference/html/jc.html
 *
 * @author mxd
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(WebSecurityConfig.class);
	}
}