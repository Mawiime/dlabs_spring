package com.example.tp_dlabs.security;

import org.springframework.security.core.Authentication;

/**
 * The facade exposes the Authentication object while hiding the static state
 *
 * @author mxd
 *
 */
public interface IAuthenticationFacade {

	/**
	 * Retrieve the user details in Spring Security.
	 *
	 * @return
	 */
	Authentication getAuthentication();

}
