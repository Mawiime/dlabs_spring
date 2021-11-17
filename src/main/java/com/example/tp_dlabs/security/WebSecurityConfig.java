package com.example.tp_dlabs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

/**
 * Implémentation basique
 *
 * @author mxd
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DlabsAuthenticationProvider authProvider;

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authProvider);
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {

		http.addFilterBefore(new CORSFilter(), BasicAuthenticationFilter.class);

		// 1. Arrêt de la gestion Cors/Csrf/FrameOptions via Srping
		// Gestion manuelle de la response http => CORSFilter.java
		http.cors().and().csrf().disable();
		http.headers().frameOptions().disable();

		// 2. Protection de tout ce qui n'est pas derrière /public
		// @formatter:off
		http.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
			.antMatchers(HttpMethod.GET, "/public/**").permitAll()
			.antMatchers(HttpMethod.POST, "/deals").authenticated()
			.and().httpBasic();
		// @formatter:on

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
