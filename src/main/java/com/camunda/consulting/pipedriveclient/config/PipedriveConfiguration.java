package com.camunda.consulting.pipedriveclient.config;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Properties;

import com.camunda.consulting.pipedriveclient.PipedriveClient;

public class PipedriveConfiguration {

	private static final String RESOURCE_FILE = "pipedrive.properties";

	public static final String JANUARY = "pipedrive.stageid.january";
	public static final String FEBRUARY = "pipedrive.stageid.february";
	public static final String MARCH = "pipedrive.stageid.march";
	public static final String APRIL = "pipedrive.stageid.april";
	public static final String MAY = "pipedrive.stageid.may";
	public static final String JUNE = "pipedrive.stageid.june";
	public static final String JULY = "pipedrive.stageid.july";
	public static final String AUGUST = "pipedrive.stageid.august";
	public static final String SEPTEMBER = "pipedrive.stageid.september";
	public static final String OCTOBER = "pipedrive.stageid.october";
	public static final String NOVEMBER = "pipedrive.stageid.november";
	public static final String DECEMBER = "pipedrive.stageid.december";

	private static final String API_TOKEN_PROPERTY = "pipedrive.apitoken";

	private final Properties properties;

	/**
	 * 
	 * @throws IOException
	 *             when pipedrive.properties file does not exist or cannot be read
	 */
	public PipedriveConfiguration() throws IOException {

		ClassLoader classLoader = PipedriveClient.class.getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(RESOURCE_FILE);

		properties = new Properties();
		properties.load(inputStream);

		inputStream.close();
	}

	/**
	 * This just calls the constructor of {@link PipedriveClient} and passes this configuration.
	 * 
	 * @return PipedriveClient
	 */
	public PipedriveClient buildPipedriveClient() {

		PipedriveClient result = new PipedriveClient(this);
		return result;
	}

	/**
	 * This returns the configured stage id for a given month.
	 * 
	 * @param month
	 *            Use one of the public static Strings from this class as parameter to refer to a month
	 * @return a stage id or {@code Integer.MIN_VALUE} if month parameter was invalid
	 */
	public int getStageIdByLocalDate(LocalDate localdate) {

		int result = Integer.MIN_VALUE;

		int monthValue = localdate.getMonthValue();
		
		String month = "";
		switch (monthValue) {
		case 1:
			month = JANUARY;
			break;
		case 2:
			month = FEBRUARY;
			break;
		case 3:
			month = MARCH;
			break;
		case 4:
			month = APRIL;
			break;
		case 5:
			month = MAY;
			break;
		case 6:
			month = JUNE;
			break;
		case 7:
			month = JULY;
			break;
		case 8:
			month = AUGUST;
			break;
		case 9:
			month = SEPTEMBER;
			break;
		case 10:
			month = OCTOBER;
			break;
		case 11:
			month = NOVEMBER;
			break;
		case 12:
			month = DECEMBER;
			break;
		default:
			// month stays empty
			break;
		}
		
		String stageIdString = properties.getProperty(month);
		result = Integer.parseInt(stageIdString);

		return result;
	}
	
	public String getApiToken() {
		String apiToken = properties.getProperty(API_TOKEN_PROPERTY);
		return apiToken;
	}
}
