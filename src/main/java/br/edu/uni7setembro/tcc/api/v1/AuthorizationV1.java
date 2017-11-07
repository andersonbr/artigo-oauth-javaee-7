package br.edu.uni7setembro.tcc.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/authorization")
public class AuthorizationV1 {

	@GET
	@Path("/authorize")
	@Produces(MediaType.APPLICATION_JSON)
	public void authorize(@QueryParam("client_id") String clientId, @QueryParam("response_type") String responseType,
			@QueryParam("redirect_uri") String redirectUri) {

	}
}
