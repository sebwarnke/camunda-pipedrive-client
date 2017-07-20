package com.camunda.consulting.pipedriveclient.pojo;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.camunda.consulting.pipedriveclient.pojo.CamundaPipedriveDeal;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CamundaPipeDriveDealTest {

	@Test
	public void testUnmarshallingToPojo() {
		ClassLoader classLoader = this.getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream("getdealsresponse.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		CamundaPipedriveDeal pipedriveDeal = null;
		
		try {
			pipedriveDeal = objectMapper.readValue(inputStream, CamundaPipedriveDeal.class);
		} catch (IOException e) {
			Assert.fail("Demarshalling shall not fail.");;
		}
		
		Assert.assertNotNull("deal must not be null", pipedriveDeal);
		Assert.assertEquals("stage_id field must be read correctly", 14, pipedriveDeal.getStage_id().intValue());
		Assert.assertEquals("consultant field must be read correctly", "54", pipedriveDeal.getConsultant());
		Assert.assertEquals("consultingHoursIncluded field must be read correctly", 10, pipedriveDeal.getConsultingHoursIncluded());
		
	}
}
