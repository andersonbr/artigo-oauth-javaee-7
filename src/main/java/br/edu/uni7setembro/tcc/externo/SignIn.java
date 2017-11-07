package br.edu.uni7setembro.tcc.externo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("signin")
public class SignIn {

	@Context
	HttpServletRequest request;

	@Context
	HttpServletResponse response;

	@GET
	@Path("auth")
	public void autenticar() throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/auth.jsp").forward(request, response);
	}
}
