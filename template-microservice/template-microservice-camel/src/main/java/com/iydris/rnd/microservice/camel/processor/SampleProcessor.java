package com.iydris.rnd.microservice.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleProcessor implements Processor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		LOGGER.info("{}", exchange.getIn().getBody());
	}

}
