package com.iydris.rnd.ws.resource;

import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iydris.rnd.microservice.api.SampleApi;
import com.iydris.rnd.microservice.model.SampleModel;

@Singleton
@Path("sample")
public class SampleResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleResource.class);

	@Inject
	private SampleApi sampleApi;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response appInfo() {
		LOGGER.info("AppInfoResource {}", this);
		
		final SampleModel model = new SampleModel();
		model.setId(UUID.randomUUID().toString());
		return Response.ok(sampleApi.execute(model)).build();
	}

}
