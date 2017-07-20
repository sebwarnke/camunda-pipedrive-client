package com.camunda.consulting.pipedriveclient;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.camunda.consulting.connectors.pipedrive.exceptions.UnexpectedResponseException;
import com.camunda.consulting.pipedriveclient.config.PipedriveConfiguration;

public class PipedriveClientTest {

	@Test
	public void testGetDealsForCurrentMonth() throws IOException {

		PipedriveClient pipedriveClient = new PipedriveConfiguration().buildPipedriveClient();
		
		try {
			pipedriveClient.getDealsForCurrentMonth();
		} catch (UnexpectedResponseException e) {
			Assert.fail("getDealsForCurrentMonth() shall not throw an Exception");
		}
	}
}
