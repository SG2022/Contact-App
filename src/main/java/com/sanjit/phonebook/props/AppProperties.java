package com.sanjit.phonebook.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
@Configuration
public class AppProperties {
	
	public AppProperties(Map<String, String> messages) {
		super();
		this.messages = messages;
	}

	private Map<String, String> messages 
	    =new HashMap<>();

	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}

	

	

}
