package bpmSlacker.stack;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionResponse {

	public List<Question> items;

	public List<Question> getItems() {
		return items;
	}

	public void setItems(List<Question> items) {
		this.items = items;
	}
	
	public int backoff = 0;
	
	public int quota_remaining;
	
}
