package br.edu.uni7setembro.tcc.externo.config;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.uni7setembro.tcc.externo.SignIn;

@ApplicationPath("externo")
public class ExtConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(SignIn.class);
		return resources;
	}
}