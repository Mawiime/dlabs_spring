package com.example.tp_dlabs.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * The facade exposes the Authentication object while hiding the static state
 *
 * @author mxd
 *
 */
public class AuthenticationFacade implements com.example.tp_dlabs.security.IAuthenticationFacade {

	@Override
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
