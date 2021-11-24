package com.example.tp_dlabs.security;

import javax.servlet.http.HttpServletRequest;

import com.example.tp_dlabs.business.LoginRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author MDE
 *
 */
@RestController
@Transactional
public class LoginBD {

	private static final Logger logger = LoggerFactory.getLogger(LoginBD.class);

	@Autowired
	private AuthenticationProvider authenticationManager;

	@PostMapping(path="/public/bd/login")
	public UtilisateurDTO login(@RequestBody final LoginRequestDTO request, final HttpServletRequest req) {

		// Controle des params obligatoires
		if (StringUtils.isEmpty(request.getIdentifier()) || StringUtils.isEmpty(request.getPassword())) {
			throw new BadCredentialsException("User/pwd must not be emtpy");

		}
		final Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getIdentifier(), request.getPassword()));
		if (authentication == null) {
			throw new BadCredentialsException("User/pwd incorrect");
		}

		final UtilisateurDTO utilisateur = (UtilisateurDTO) authentication.getPrincipal();
		logger.debug("New user logged : " + utilisateur.getUsername());

		return new UtilisateurDTO(utilisateur.getUsername(), utilisateur.getPassword(), utilisateur.getAuthorities());
	}

}
