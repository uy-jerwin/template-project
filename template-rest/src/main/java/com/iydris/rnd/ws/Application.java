package com.iydris.rnd.ws;

import org.glassfish.jersey.server.ResourceConfig;

import com.iydris.rnd.ws.resource.SampleResource;

public class Application extends ResourceConfig {

	public Application() {
		super();

		register(SampleResource.class);
	}
	
}
