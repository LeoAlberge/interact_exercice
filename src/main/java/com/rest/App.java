package com.rest;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.ws.rs.client.Client;

import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.rest.controller.MovieRESTController;



public class App extends Application<Configuration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	@Override
	public void initialize(Bootstrap<Configuration> b) {
	}

	@Override
	public void run(Configuration c, Environment e) throws Exception 
	{
		LOGGER.info("Registering REST resources");
		
		e.jersey().register(new MovieRESTController(e.getValidator()));    
		//e.getObjectMapper().registerModule(new JodaModule());
		//e.getObjectMapper().getSerializationConfig().setDateFormat(new SimpleDateFormat("EEE MMM dd yyyy "));
		e.getObjectMapper().registerModule(new JodaModule());
		e.getObjectMapper().disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		//e.getObjectMapper().setDateFormat(new ISO8601DateFormat());



	}

	public static void main(String[] args) throws Exception {
		new App().run(args);
	}
}