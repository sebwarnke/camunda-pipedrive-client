package com.camunda.consulting.pipedriveclient;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.camunda.consulting.connectors.pipedrive.exceptions.UnexpectedResponseException;
import com.camunda.consulting.connectors.pipedrive.rest.GetDealsRequest;
import com.camunda.consulting.connectors.pipedrive.rest.GetDealsResponse;
import com.camunda.consulting.pipedriveclient.config.PipedriveConfiguration;
import com.camunda.consulting.pipedriveclient.pojo.CamundaPipedriveDeal;

public class PipedriveClient {

//	private static final Logger log = LoggerFactory.getLogger(PipedriveClient.class);

	PipedriveConfiguration configuration;
	
	public PipedriveClient(PipedriveConfiguration configuration) {

		this.configuration = configuration;
	}

	public List<CamundaPipedriveDeal> getDealsForCurrentMonth() throws UnexpectedResponseException {

		List<CamundaPipedriveDeal> result = new ArrayList<CamundaPipedriveDeal>();

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.of("CET")).toLocalDate();
		
		int stageId = configuration.getStageIdByLocalDate(localDate);
		
		GetDealsRequest getDealsRequest = new GetDealsRequest();
		getDealsRequest.setStageId(stageId);
		getDealsRequest.setApiToken(configuration.getApiToken());
		GetDealsResponse getDealsResponse = getDealsRequest.submit();
		
		result = getDealsResponse.getDeals(CamundaPipedriveDeal.class);
		
		return result;
	}
}
