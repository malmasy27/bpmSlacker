package bpmSlacker;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {
	
	public List<String> tags;
	
	@JsonProperty("slack-webhook-url")
	public String slackWebhookUrl;
	
	@JsonProperty("state-file")
	public String stateFile;

}
