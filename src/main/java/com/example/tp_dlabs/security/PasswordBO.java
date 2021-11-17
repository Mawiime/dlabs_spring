package com.example.tp_dlabs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Codage / décoage mot de passe
 * Encapsulation de BCryptPasswordEncoder
 * @author Max
 * @see BCryptPasswordEncoder
 *
 */
@Service
public class PasswordBO {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	/**
	 * Le password correspond il à celui crypté ?
	 * @param BCryptFormat : Crypté
	 * @param rawFormat : Clair
	 * @return
	 */
	public Boolean matches(final String rawFormat, final String BCryptFormat) {
		return passwordEncoder.matches(rawFormat, BCryptFormat);
	}

	/**
	 * Encode le mot de passe
	 * @param BCryptFormat
	 * @param textFormat
	 * @return
	 */
	public String encode(final String textFormat) {
		return passwordEncoder.encode(textFormat);
	}

}
