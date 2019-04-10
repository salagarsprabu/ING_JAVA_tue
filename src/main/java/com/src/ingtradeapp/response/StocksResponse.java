package com.src.ingtradeapp.response;
import org.springframework.stereotype.Component;

@Component
public class StocksResponse {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StocksResponse() {
	}
}