package com.example.tp_dlabs.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * La protection CORS est une protection du navigateur.
 * <br>Celui va vérifier dans la <b>RESPONSE</b> (= après execution de la request OPTIONS) :
 * <ul>
 * 	<li>Si le domaine qui a lancé la request est bien autorisé par le serveur : Access-Control-Allow-Origin </li>
 * 	<li>Si la méthode d'accès est bien autorisée par le serveur : Access-Control-Allow-Methods </li>
 * </ul>
 * <br> Note : Le filter doit se trouver le plus bas possible, avant la sécurité.
 *
 * @author Max
 *
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {

	@Override
	public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) throws IOException, ServletException {
		final HttpServletResponse response = (HttpServletResponse) res;

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		response.setHeader("Access-Control-Allow-Headers",
				"Content-Type, Access-Control-Allow-Origin, Access-Control-Allow-Headers, Access-Control-Allow-Credentials, authorization ");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Max-Age", "3600");
		chain.doFilter(req, res);
	}

	@Override
	public void init(final FilterConfig filterConfig) throws ServletException {
		// Nothing here
	}

	@Override
	public void destroy() {
		// Nothing here
	}

}
