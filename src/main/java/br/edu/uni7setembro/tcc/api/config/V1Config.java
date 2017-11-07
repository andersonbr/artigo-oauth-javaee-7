package br.edu.uni7setembro.tcc.api.config;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.uni7setembro.tcc.api.v1.AuthorizationV1;

@ApplicationPath("api/v1")
public class V1Config extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(AuthorizationV1.class);
		return resources;
	}
}